package com.springlessons.catalog.example.feign;

import com.springlessons.catalog.example.Trader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TraderController {

    private TraderClient traderClient;

    @GetMapping("/traders-filtered")
        public List<Trader> getFilteredTraders (@RequestHeader("x-city-id") Integer cityId){
            List<Trader> traders = traderClient.getTraders();
            return traders.stream()
                    .filter(trader -> trader.getCityId().equals(cityId))
                    .collect(Collectors.toList());
        }
}
