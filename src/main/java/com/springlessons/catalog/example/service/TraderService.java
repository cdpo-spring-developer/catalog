package com.springlessons.catalog.example.service;


import com.springlessons.catalog.example.Trader;
import com.springlessons.catalog.example.feign.TraderClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TraderService {

    private TraderClient traderClient;

    public List<Trader> getFilteredTraders(Integer cityId) {
        List<Trader> traders = traderClient.getTraders();
        return traders.stream()
                .filter(trader -> trader.getCityId().equals(cityId))
                .collect(Collectors.toList());
    }

}
