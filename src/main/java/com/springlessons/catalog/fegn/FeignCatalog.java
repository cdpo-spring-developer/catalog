package com.springlessons.catalog.fegn;

import com.springlessons.catalog.entity.Trader;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "", url = "http://localhost:8088/traders")
public interface FeignCatalog {

    @GetMapping
    List<Trader> getAllTraders();
}
