package com.springlessons.catalog.example.feign.service;

import com.springlessons.catalog.example.feign.dto.Trader;
import com.springlessons.catalog.example.feign.feign.TradersFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class TraderService {

    private final TradersFeignClient tradersFeignClient;

    public List<Trader> getTradersByCity(final Integer cityId) {
        log.debug("Getting all traders for city with id = '{}'", cityId);
        List<Trader> traders = tradersFeignClient.getTraders();

        return Optional.ofNullable(traders)
                .orElseGet(List::of)
                .stream()
                .filter(trader -> cityId.equals(trader.getCityId()))
                .collect(Collectors.toList());
    }
}
