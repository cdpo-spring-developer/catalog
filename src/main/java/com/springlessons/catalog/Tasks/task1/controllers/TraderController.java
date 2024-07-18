package com.springlessons.catalog.Tasks.task1.controllers;

import com.springlessons.catalog.Tasks.task1.entity.City;
import com.springlessons.catalog.Tasks.task1.entity.Trader;
import com.springlessons.catalog.Tasks.task1.services.CityService;
import com.springlessons.catalog.Tasks.task1.services.TraderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RequestMapping("/api/v1/catalog")
@RestController
public class TraderController {

    private final TraderService traderService;
    private final CityService cityService;

    @GetMapping("/traders")
    public ResponseEntity<List<Trader>> getTraders(@RequestHeader("x-city-id") Integer cityId) {
        List<Trader> filteredTraders = traderService.filterTradersByCityId(cityId);
        return ResponseEntity.ok(filteredTraders);
    }

    @GetMapping("/cities")
    public ResponseEntity<List<City>> getCities (){
        List<City> cityList = cityService.getAll();
        return ResponseEntity.ok(cityList);
    }

}
