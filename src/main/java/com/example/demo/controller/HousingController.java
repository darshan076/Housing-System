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

    @PostMapping("save-all")
    public void saveAll(@RequestBody List<HouseDetails> h){
        service.saveAllHouse(h);
    }

    @GetMapping("avg-all")
    public double avgAll(){
        return service.avgAll();
    }

    @GetMapping("avg-all-loc")
    public List<Double> avgAllLoc(){
        return service.avgAllLoc();
    }

    @GetMapping("max-price")
    public double maxPrice(){
        return service.maxPrice();
    }

    @GetMapping("min-price")
    public double minPrice(){
        return service.minPrice();
    }

    @GetMapping("avg-by-loc/{location}")
    public double avgByLoc(@PathVariable String location){
        return service.avgByLoc(location);
    }
}
