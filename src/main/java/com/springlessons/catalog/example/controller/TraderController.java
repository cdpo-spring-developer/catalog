package com.springlessons.catalog.example.controller;

import com.springlessons.catalog.example.Trader;
import com.springlessons.catalog.example.feign.TraderClient;
import com.springlessons.catalog.example.service.TraderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TraderController {

    private TraderService traderService;

    @GetMapping("/traders-filtered")
    public List<Trader> getFilteredTraders(@RequestHeader("x-city-id") Integer cityId) {
        return traderService.getFilteredTraders(cityId);
    }
}
