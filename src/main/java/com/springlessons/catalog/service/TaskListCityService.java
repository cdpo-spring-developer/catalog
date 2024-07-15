package com.springlessons.catalog.service;

import com.springlessons.catalog.fegn.CityFeign;
import com.springlessons.catalog.repository.CityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
@EnableScheduling
@RequiredArgsConstructor
@Transactional
public class TaskListCityService {

    private final CityFeign cityFeign;

    private final CityRepository cityRepository;

    private static final int TIME = 1;

    @Scheduled(fixedRate = TIME, timeUnit = TimeUnit.DAYS)
    public void checkRecords() {
        cityFeign.findAll().forEach(cityRepository::save);
    }
}
