package com.springlessons.catalog.service;

import com.springlessons.catalog.entity.Trader;
import com.springlessons.catalog.fegn.FeignCatalog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TraderService {

    private final FeignCatalog feignCatalog;

    public List<Trader> getAllTraderByCityId(Integer id){
        return feignCatalog.getAllTraders()
                .stream()
                .filter(tr -> tr.getCityId() == id)
                .toList();
    }
}
