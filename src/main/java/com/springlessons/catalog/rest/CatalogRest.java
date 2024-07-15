package com.springlessons.catalog.rest;

import com.springlessons.catalog.entity.Trader;
import com.springlessons.catalog.service.ServiceTrader;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/trader")
public class CatalogRest {

    private final ServiceTrader serviceTrader;

    @GetMapping
    public List<Trader> getAllTradersWithIdCity(@RequestHeader("x-city-id") Integer id) {
        return serviceTrader.getAllTraderByCityId(id);
    }
}
