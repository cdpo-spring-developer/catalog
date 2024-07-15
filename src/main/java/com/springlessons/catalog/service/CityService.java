package com.springlessons.catalog.service;

import com.springlessons.catalog.entity.City;
import com.springlessons.catalog.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;
    public List<City> getAllCity(){
        return cityRepository.findAll();
    }
}
