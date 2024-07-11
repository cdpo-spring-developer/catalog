package com.springlessons.catalog.rest.task01;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@EnableScheduling
public class ScheduledTasks {
    private final CityRestExecutor cityRestExecutor;
    private final CityRepository cityRepository;

    public ScheduledTasks(CityRestExecutor cityRestExecutor,  CityRepository cityRepository) {
        this.cityRestExecutor = cityRestExecutor;
        this.cityRepository = cityRepository;
    }

    @Async("cities-executor")
    @Scheduled(fixedRate = 7, timeUnit = TimeUnit.DAYS)
    public void runBySchedule() {
       List<City> cities = cityRestExecutor.restExecutor();
        cityRepository.saveAll(cities);
    }
}
