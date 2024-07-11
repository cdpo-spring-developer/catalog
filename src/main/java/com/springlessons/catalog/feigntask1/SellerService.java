package com.springlessons.catalog.feigntask1;

import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SellerService {

    private final FeignSellersClient sellersClient;

    public SellerService(FeignSellersClient sellersClient) {
        this.sellersClient = sellersClient;
    }

    public List<Sellsers> findAllSellersById(@RequestHeader("x-city-id") int cityId){
        List<Sellsers> sellsersList = new ArrayList<>();
        sellsersList.stream().
                map(sellsers -> sellsers.getCityId())
                .filter(Id->Id>cityId)
                .collect(Collectors.toList());
        return sellsersList;
    }
}
