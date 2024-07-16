package com.springlessons.catalog.example.feign.task01;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.http.HttpHeaders;

@FeignClient
public interface TraderClient {
    @RequestMapping(method = RequestMethod.GET, value = "/traders")
    String getTraders(@RequestHeader HttpHeaders headers);
}
