package com.cicada.redis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cicada.redis.domain.City;

public interface CityDao {
    List<City> findAllCity();

    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(@Param("id") Long id);
}
