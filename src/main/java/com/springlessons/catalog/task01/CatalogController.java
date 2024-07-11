package com.springlessons.catalog.task01;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api/v1/catalog")
public class CatalogController {

    TradersService tradersService;

    public CatalogController(TradersService tradersService) {
        this.tradersService = tradersService;
    }

    @GetMapping
    public List<Trader> getCatalogByCity(@RequestHeader HttpHeaders header, String city) {
        List<String> cityId = header.get(city);
        List<Trader> traders = tradersService.getTraders();
        traders.stream()
                .filter(trader -> cityId.contains(header.get(city))).collect(Collectors.toSet());
        return traders;
    }
}
