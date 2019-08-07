package com.cicada.redis.service;

import com.cicada.redis.domain.City;

public interface CityService {
    City getCityByName(String cityName);

    void saveCity(City city);

    void updateCityDescription(String cityName, String description);
}
