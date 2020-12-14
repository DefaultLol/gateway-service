package com.project.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CircuitBreakerController {

    @GetMapping("/defaultCountries")
    public Map<String,String> countries(){
        Map<String,String> countries=new HashMap<>();
        countries.put("message","default countries");
        countries.put("countries","Morocco,France,Germany,USA,.....");
        return countries;
    }
}
