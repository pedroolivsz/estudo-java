package com.io.github.pedroolivsz.testesUnitarios.locadora.entity;

import java.util.Date;

public class Rental {
    private User user;
    private Movie movie;
    private Date rentalDate;
    private Date returnDate;
    private Double value;

    public Rental() {
    }

    public Rental(User user, Movie movie, Date rentalDate, Date returnDate, Double value) {
        this.user = user;
        this.movie = movie;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
