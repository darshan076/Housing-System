package com.example.demo.service;

import com.example.demo.model.HouseDetails;
import com.example.demo.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    HouseRepository houseRepository;

    public void saveAllHouse(List<HouseDetails> h){
        houseRepository.saveAll(h);
    }

    public double avgAll() {
        return houseRepository.averageAll();
    }

    public List<Double> avgAllLoc() {
        return houseRepository.averageAllLocation();
    }

    public double maxPrice() {
        return houseRepository.maxPrice();
    }

    public double minPrice() {
        return houseRepository.minPrice();
    }

    public double avgByLoc(String location) {
        return houseRepository.avgByLocation(location);
    }
}
