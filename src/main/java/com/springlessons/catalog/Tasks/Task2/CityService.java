package com.springlessons.catalog.Tasks.Task2;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
@Service
public class CityService {

    private final CityRepository cityRepository;
    private final RestTemplate restTemplate;

    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.DAYS)
    public void fetchCities() {

        String url = "http://localhost:8089/cities";
        ResponseEntity<List<City>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<City>>() {
                }
        );
        List<City> cities = response.getBody();

        if (cities != null) {
            for (City city : cities) {
                cityRepository.save(city);
            }
        }
    }
}








