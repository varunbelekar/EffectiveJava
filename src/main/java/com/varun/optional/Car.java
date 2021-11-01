package com.varun.optional;

public class Car {
    private String carName;
    private Insurance insurance;

    public Car(String carName, Insurance insurance){
        this.insurance = insurance;
        this.carName = carName;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public String getCarName() {
        return carName;
    }
}
