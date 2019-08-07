package com.cicada.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.redis.domain.City;
import com.cicada.redis.service.CityService;

@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;

    @GetMapping("/redis/findOneCity/{id}")
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @PostMapping(value = "/redis/createCity", consumes = "application/json;charset=utf-8", produces = "application/json;charset=utf-8")
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @PutMapping(value = "/redis/modifyCity", consumes = "application/json;charset=utf-8", produces = "application/json;charset=utf-8")
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @DeleteMapping("/redis/removeCity/{id}")
    public void removeCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
