package com.springlessons.catalog.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trader {
    private Integer id;
    private String name;
    private String description;
    private String logo;
    @JsonProperty("site_link")
    private String siteLink;
    @JsonProperty("city_id")
    private int cityId;
}
