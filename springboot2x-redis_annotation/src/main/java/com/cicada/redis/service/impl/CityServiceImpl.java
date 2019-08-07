package com.cicada.redis.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cicada.redis.domain.City;
import com.cicada.redis.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    /** 模拟数据库存储 */
    private Map<String, City> cityMap = new HashMap<String, City>();

    @Cacheable(value = "baseCityInfo", key = "123")
    @Override
    public City getCityByName(String cityName) {
        /** 模拟数据库查询并返回 */
        return cityMap.get(cityName);
    }

    @Override
    public void saveCity(City city) {
        /** 模式数据库插入操作 */
        cityMap.put(city.getCityName(), city);
    }

    @CacheEvict(value = "baseCityInfo", key = "123")
    @Override
    public void updateCityDescription(String cityName, String description) {
        City city = cityMap.get(cityName);
        city.setDescription(description);
        /** 模拟更新数据库 */
        cityMap.put(cityName, city);
    }

}
