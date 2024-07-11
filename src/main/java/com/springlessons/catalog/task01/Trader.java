package com.springlessons.catalog.task01;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class Trader {

    private long id;

    private String name;

    private String description;

    private String logo;

    @JsonProperty
    private String siteLink;

    private int cityId;

}
