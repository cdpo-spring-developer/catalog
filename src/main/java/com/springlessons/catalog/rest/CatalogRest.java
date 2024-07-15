package com.springlessons.catalog.rest;

import com.springlessons.catalog.entity.Trader;
import com.springlessons.catalog.service.TraderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class CatalogRest {

    private final TraderService traderService;

    @GetMapping
    public List<Trader> getAllTradersWithIdCity(@RequestHeader("x-city-id") Integer id) {
        return traderService.getAllTraderByCityId(id);
    }
}
