package com.springlessons.catalog.example.feign.task01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trader") // user group
public class Trader {
    @Id
    private int id;
    private String name;
    private String description;
    private int city_id;


}
