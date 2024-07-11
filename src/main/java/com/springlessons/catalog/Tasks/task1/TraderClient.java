package com.springlessons.catalog.Tasks.task1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "traders", url = "http://localhost:8088")
public interface TraderClient {

    @GetMapping("/traders")
    List<Trader> getTraders(@RequestBody Trader trader);
}

class Trader {
    private Integer id;
    private String name;
    private String description;
    private String logo;
    private String siteLink;
    private Integer cityId;
}