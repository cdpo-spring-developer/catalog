package com.springlessons.catalog.rest.task01;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService {
    CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        List<City> cities = (List<City>) cityRepository.findAll();
       return cities;
    }
}
