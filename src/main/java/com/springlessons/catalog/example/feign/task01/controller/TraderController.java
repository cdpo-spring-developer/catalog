package com.springlessons.catalog.example.feign.task01.controller;

import com.google.gson.Gson;
import com.springlessons.catalog.example.feign.task01.Trader;
import com.springlessons.catalog.example.feign.task01.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;

@RestController
public class TraderController {

    @Autowired
    private TraderService service;

    @GetMapping("/traders")
    public String getTradersByCity(@RequestHeader HttpHeader header) {
        {
            Integer cityId = header.get("x-city-id");

            List<Trader> tradersByCity = service.getTradersByCity(cityId);

            Gson gson = new Gson();
            String listAsJson = gson.toJson(tradersByCity);
            return listAsJson;
        }
    }
}