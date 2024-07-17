package com.springlessons.catalog.example.feign.task01.service;

import com.springlessons.catalog.example.feign.task01.Trader;
import com.springlessons.catalog.example.feign.task01.repository.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraderService {
    @Autowired
    TraderRepository repository;



    public List<Trader> getTradersByCity(Integer cityId) {
        return repository.findAll()
                .stream()
                .filter(trader -> trader.getCity_id() == cityId)
                .toList();
    }
}
