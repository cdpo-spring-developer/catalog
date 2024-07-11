package com.springlessons.catalog.example.feign.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Trader {

    private Integer id;
    private String name;
    private String description;
    private String logo;
    private String siteLink;
    private Integer cityId;
}
