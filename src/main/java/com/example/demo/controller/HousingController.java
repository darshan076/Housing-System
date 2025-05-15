package com.example.demo.controller;

import com.example.demo.model.HouseDetails;
import com.example.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("house")
public class HousingController {
    @Autowired
    HouseService service;

    @PostMapping("saveAll")
    public void saveAll(@RequestBody List<HouseDetails> h){
        service.saveAllHouse(h);
    }

    @GetMapping("avgAll")
    public double avgAll(){
        return service.avgAll();
    }

    @GetMapping("avgAllLoc")
    public List<Double> avgAllLoc(){
        return service.avgAllLoc();
    }

    @GetMapping("maxPrice")
    public double maxPrice(){
        return service.maxPrice();
    }

    @GetMapping("minPrice")
    public double minPrice(){
        return service.minPrice();
    }

    @GetMapping("avgByLoc/{location}")
    public double avgByLoc(@PathVariable String location){
        return service.avgByLoc(location);
    }
}
