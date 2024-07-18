package com.springlessons.catalog.Tasks.task1.services;

import com.springlessons.catalog.Tasks.task1.entity.Trader;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraderService {
    private final TraderClient traderClient;

    public TraderService(TraderClient traderClient) {
        this.traderClient = traderClient;
    }

    public List<Trader> filterTradersByCityId(Integer cityId) {
        List<Trader> allTraders = traderClient.getAllTraders();
        return allTraders.stream()
                .filter(trader -> trader.getCityId().equals(cityId))
                .toList();
    }
}
