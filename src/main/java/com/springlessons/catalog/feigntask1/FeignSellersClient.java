package com.springlessons.catalog.feigntask1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@org.springframework.cloud.openfeign.FeignClient(value = "", url = "http://localhost:8088/traders")
public interface FeignSellersClient {


    @GetMapping("/filter")
    List<Sellsers> findAllSellsersById(@RequestParam Integer cityId);
}
