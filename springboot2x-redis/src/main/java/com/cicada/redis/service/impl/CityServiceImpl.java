package com.cicada.redis.service.impl;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.cicada.redis.dao.CityDao;
import com.cicada.redis.domain.City;
import com.cicada.redis.service.CityService;

@Service
public class CityServiceImpl implements CityService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityDao cityDao;

    @Resource
    private RedisTemplate<String, City> redisTemplate;

    @Override
    public City findCityById(Long id) {
        String key = "city_" + id;
        ValueOperations<String, City> operations = redisTemplate.opsForValue();
        /** 缓存存在从缓存中取 */
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            City city = operations.get(key);
            LOGGER.info("CityServiceImpl.findCityById():从缓存中获取了城市>>" + city.toString());
            return city;
        }
        /** 缓存不存在从DB中取 */
        City city = cityDao.findById(id);
        /** 插入缓存 */
        operations.set(key, city, 10, TimeUnit.SECONDS);
        LOGGER.info("CityServiceImpl.findCityById():城市插入缓存>>" + city.toString());
        return city;
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        Long ret = cityDao.updateCity(city);
        /** 缓存存在，删除缓存 */
        String key = "city_" + city.getId();
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);
            LOGGER.info("CityServiceImpl.updateCity():从缓存中删除城市>>" + city.toString());
        }
        return ret;
    }

    @Override
    public Long deleteCity(Long id) {
        Long ret = cityDao.deleteCity(id);
        /** 缓存存在，删除缓存 */
        String key = "city_" + id;
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);
            LOGGER.info("CityServiceImpl.deleteCity():从缓存中删除城市>>" + id);
        }
        return ret;
    }

}
