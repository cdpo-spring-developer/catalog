package com.springlessons.catalog.example.feign.task02;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Period;

@Configuration
public class CityConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder()
                .setConnectTimeout(Period.ofDays(1))
                .build();
    }
}
