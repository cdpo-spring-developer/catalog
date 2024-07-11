package com.springlessons.catalog.example.feign;

import com.springlessons.catalog.example.Trader;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "traderClient", url = "http://localhost:8088")
public class TraderClient {

    @GetMapping("/traders")
    List<Trader> getTraders();
}
