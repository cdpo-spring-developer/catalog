package com.springlessons.catalog.example.feign.controller;

import com.springlessons.catalog.example.feign.dto.Trader;
import com.springlessons.catalog.example.feign.service.TraderService;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(TraderController.REST_URL)
@RequiredArgsConstructor
public class TraderController {

    static final String REST_URL = "/api/v1/some-url-part";

    private final TraderService traderService;

    @GetMapping("/traders")
    public ResponseEntity<List<Trader>> getAllTradersInCity(@RequestHeader(value = "x-city-id", required = false) final Integer cityId) {
        try {
            return ResponseEntity.ok(traderService.getTradersByCity(cityId));
        } catch (FeignException e) {
            log.error("Error getting traders", e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
