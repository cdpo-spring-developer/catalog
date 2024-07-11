package com.springlessons.catalog.rest.task01;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CityController {

   private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public String getCities(Model model) {
        List<City> cities = cityService.getAllCities();
        model.addAttribute("cities_list", cities);
        return "city/cities";
    }
    }

