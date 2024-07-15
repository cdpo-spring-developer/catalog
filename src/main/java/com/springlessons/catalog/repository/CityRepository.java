package com.springlessons.catalog.repository;

import com.springlessons.catalog.entity.City;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CityRepository extends CrudRepository<City, Integer> {

    @NonNull
    List<City> findAll();
}
