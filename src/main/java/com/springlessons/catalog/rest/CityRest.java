package com.springlessons.catalog.rest;

import com.springlessons.catalog.entity.City;
import com.springlessons.catalog.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityRest {
    private final CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
        return cityService.getAllCity();
    }
}
