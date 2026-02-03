package com.io.github.pedroolivsz.testesUnitarios.locadora.entity;

public class Movie {
    private String name;
    private Integer quantityStock;
    private Double rentalPrice;

    public Movie() {
    }

    public Movie(String name, Integer quantityStock, Double rentalPrice) {
        this.name = name;
        this.quantityStock = quantityStock;
        this.rentalPrice = rentalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
