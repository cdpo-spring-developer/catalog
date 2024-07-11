package com.springlessons.catalog.rest.task01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CityController {

   private final ScheduledTasks scheduledTasks;

    public CityController(ScheduledTasks scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
    }

    @GetMapping("/cities")
    public List<City> getCities() {
        List<City> cities = scheduledTasks.runBySchedule();
        return cities;
    }
}
