package com.springlessons.catalog.task01;

import com.springlessons.catalog.example.Cat;
import com.springlessons.catalog.example.feign.XXXClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradersService {
    private final TradersClient tradersClient;

    public TradersService(TradersClient tradersClient) {
        this.tradersClient = tradersClient;
    }

    public List<Trader> getTraders(int cityId) {
        List<Trader> traders = tradersClient.getTraders();
        traders.stream()
                .filter(trader -> trader.getCityId() == cityId).collect(Collectors.toList());
        return tradersClient.getTraders();
    }
}
