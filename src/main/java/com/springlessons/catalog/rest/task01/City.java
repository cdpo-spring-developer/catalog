package com.springlessons.catalog.rest.task01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "city")
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String code;

    @NonNull
    private double lat;

    @NonNull
    private double lon;
}
/*
Обновлять информацию о городах раз в сутки.

1. Получить список от сторонней системы (использовать restTemplate) раз в сутки

API сторонней системы
запрос GET: http://localhost:8089/cities
пример ответа
        [
  {
          "id": 343,
          "name": "Москва",
          "code" : "msk",
          "lat": 12233.78,
          "lon": 12233.78
          }
          ]

          2. Обновить информацию в БД*/
