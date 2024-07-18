package com.springlessons.catalog.Tasks.task1.services;

import com.springlessons.catalog.Tasks.task1.entity.Trader;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "traders", url = "http://localhost:8088")
public interface TraderClient {

    @GetMapping("/traders")
    List<Trader> getAllTraders();

}

