package com.springlessons.catalog.example.rest.repository;

import com.springlessons.catalog.example.rest.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
