package com.springlessons.catalog.example;

import lombok.Data;

@Data
public class Trader {
        private Long id;
        private String name;
        private String description;
        private String logo;
        private String siteLink;
        private Integer cityId;

    }

