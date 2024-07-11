package com.springlessons.catalog.Tasks.task1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/api/v1")
@RestController
public class TraderController {

    private final TraderService traderService;

    public TraderController(TraderService traderService) {
        this.traderService = traderService;
    }

    @GetMapping("/traders")
    public ResponseEntity<List<Trader>> getTraders(@RequestHeader("x-city-id") Integer cityId) {
        List<Trader> filteredTraders = traderService.filterTradersByCityId(cityId);
        return ResponseEntity.ok(filteredTraders);
    }

}
