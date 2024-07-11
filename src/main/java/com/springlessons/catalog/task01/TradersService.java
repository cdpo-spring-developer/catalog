package com.springlessons.catalog.task01;

import com.springlessons.catalog.example.Cat;
import com.springlessons.catalog.example.feign.XXXClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradersService {
    private final TradersClient tradersClient;

    public TradersService(TradersClient tradersClient) {
        this.tradersClient = tradersClient;
    }

    public List<Trader> getTraders() {
        return tradersClient.getTraders();
    }
}
