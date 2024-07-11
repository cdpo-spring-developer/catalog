package com.springlessons.catalog.feigntask1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Sellsers {

    private int id;

    private int cityId;
    private String name;
    private String description;
    private String site;

}
