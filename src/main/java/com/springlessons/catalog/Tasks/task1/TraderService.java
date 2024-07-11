package com.springlessons.catalog.Tasks.task1;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TraderService {
    private final TraderClient traderClient;

    public TraderService(TraderClient traderClient) {
        this.traderClient = traderClient;
    }

    public List<Trader> filterTradersByCityId(Integer cityId) {
        List<Trader> allTraders = traderClient.getAllTraders();
        return allTraders.stream()
                .filter(trader -> trader.cityId().equals(cityId))
                .collect(Collectors.toList());
    }
}
