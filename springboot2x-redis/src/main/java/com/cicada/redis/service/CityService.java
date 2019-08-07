package com.cicada.redis.service;

import com.cicada.redis.domain.City;

public interface CityService {
    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
