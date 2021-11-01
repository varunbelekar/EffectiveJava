package com.varun.optional;

public class Person {
    private String name;
    private Car car;

    public Person(String name, Car car){
        this.name = name;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }
}
