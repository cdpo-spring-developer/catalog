package com.springlessons.catalog.example.feign.task01.repository;

import com.springlessons.catalog.example.feign.task01.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraderRepository extends JpaRepository<Trader, Integer> {
}
