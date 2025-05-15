package com.example.demo.repository;

import com.example.demo.model.HouseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<HouseDetails, Integer> {
    @Query(value = "select avg(price) from house" , nativeQuery = true)
    Double averageAll();

    @Query(value = "select avg(price) from house group by locat" , nativeQuery = true)
    List<Double> averageAllLocation();

    @Query(value = "select max(price) from house", nativeQuery = true)
    Double maxPrice();

    @Query(value = "select min(price) from house", nativeQuery = true)
    Double minPrice();

    @Query(value = "select avg(price) from house where locat = ?1", nativeQuery = true)
    Double avgByLocation(String location);
}
