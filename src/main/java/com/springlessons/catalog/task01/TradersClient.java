package com.springlessons.catalog.task01;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "Traders", url = "http://ip:8088/traders")
public interface TradersClient {
    @GetMapping
    List<Trader> getTraders();
}
