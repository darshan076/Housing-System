package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "house")
public class HouseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bed")
    private int bedrooms;
    @Column(name = "bath")
    private float bathrooms;
    @Column(name = "square")
    private int squareFootage;
    @Column(name = "locat")
    private String location;
    @Column(name = "price")
    private double salePrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public float getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(float bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
