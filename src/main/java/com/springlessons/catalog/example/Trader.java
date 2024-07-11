package com.springlessons.catalog.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Trader {
        private Long id;
        private String name;
        private String description;
        private String logo;

        @JsonProperty("site_link")
        private String siteLink;

        @JsonProperty("city_id")
        private Integer cityId;

    }

