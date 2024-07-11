package com.springlessons.catalog.example.feign.feign;

import com.springlessons.catalog.example.feign.dto.Trader;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "traders", url = "http://localhost:8088/traders")
public interface TradersFeignClient {

    @GetMapping
    List<Trader> getTraders();
}
