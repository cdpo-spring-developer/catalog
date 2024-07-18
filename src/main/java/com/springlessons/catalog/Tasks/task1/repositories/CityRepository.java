package com.springlessons.catalog.Tasks.task1.repositories;

import com.springlessons.catalog.Tasks.task1.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
