package com.cicada.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cicada.redis.domain.City;
import com.cicada.redis.service.CityService;
import com.cicada.redis.service.impl.CityServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisAnnotationApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityService cityService;

    @Test
    public void testRedis() {
        City city = getShanghai();
        /** 向redis中存入数据 */
        cityService.saveCity(city);
        /** 从redis中取数据 */
        City cityInfo = cityService.getCityByName("上海");
        LOGGER.info(cityInfo.toString());
    }

    @Test
    public void testRedisCache() {
        City city = getBeijing();
        /** 向redis中存入数据 */
        cityService.saveCity(city);

        /** 从redis中取数据 ，第一次查询 */
        City cityInfo = cityService.getCityByName("北京");
        LOGGER.info("第一次查询：" + cityInfo.toString());

        /** 从redis中取数据 ，第二次查询 */
        cityInfo = cityService.getCityByName("北京");
        LOGGER.info("第二次查询：" + cityInfo.toString());

        /** 更新city的描述信息后查询 */
        cityService.updateCityDescription("北京", "北京没南京好");
        cityInfo = cityService.getCityByName("北京");
        LOGGER.info("更新后查询：" + cityInfo.toString());
    }

    private City getBeijing() {
        City city = new City();
        city.setId(2L);
        city.setProvinceId(2L);
        city.setCityName("北京");
        city.setDescription("人称首都");
        return city;
    }

    private City getShanghai() {
        City city = new City();
        city.setId(1L);
        city.setProvinceId(1L);
        city.setCityName("上海");
        city.setDescription("人称魔都");
        return city;
    }

}
