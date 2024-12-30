package com.charan.demo.examples.a2Ex1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findmax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
