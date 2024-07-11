package com.springlessons.catalog.task01;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "trader")
public class Trader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private String logo;

    @NonNull
    private String siteLink;

    @OneToMany
    private City city;

    public Trader() {

    }

}
