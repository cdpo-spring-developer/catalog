package com.springlessons.catalog.rest.task01;

import com.springlessons.catalog.example.Cat;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class CityRestExecutor {
    private final RestTemplate restTemplate;

    public CityRestExecutor(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<City> restExecutor() {

        City city = restTemplate.getForObject("http://localhost:8089/cities", City.class);

        ResponseEntity<List<City>> listResponseEntity = restTemplate.exchange(
                "http://localhost:8089/cities",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<>() {
                }
        );
        return listResponseEntity.getBody();
    }
}

