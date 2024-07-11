package com.springlessons.catalog.example.rest.service;

import com.springlessons.catalog.example.rest.model.City;
import com.springlessons.catalog.example.rest.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@EnableScheduling
@RequiredArgsConstructor
public class SchedulerCityService {

    @Value("${city.service.url}")
    private String cityServiceUrl;

    @Qualifier("cityServiceRestTemplate")
    private final RestTemplate restTemplate;
    private final CityRepository cityRepository;

    @Scheduled(cron = "0 0 0 * * ?")
    public void updateCityInfo() {
        try {
            List<City> cities = fetchCities();
            cityRepository.saveAll(cities);
            log.debug("Update task complete successfully");
        } catch (RestClientException e) {
            log.error("Error getting cities from remote system", e);
        }
    }

    private List<City> fetchCities() {
        ResponseEntity<List<City>> response = restTemplate.exchange(
                cityServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );
        return Objects.requireNonNull(response.getBody(), "City list from the remote system is null");
    }
}
