package com.springlessons.catalog.fegn;

import com.springlessons.catalog.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "", url = "http://localhost:8089/cities")
public interface CityFeign {

    @GetMapping
    List<City> findAll();
}
