package com.varun.optional;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.util.List;
import java.util.Optional;

public class CarCheck {
    public static void main(String[] args) {
        Insurance reliance = new Insurance("Reliance");
        Car hondaCity = new Car("Honda City", reliance);
        Person p1 = new Person("Mohanish", hondaCity);

        /*if (p1 != null){
            System.out.println("Name: " + p1.getName());
            if (p1.getCar() != null){
                Car car = p1.getCar();
                System.out.println("Car Name : " + car.getCarName());
                if (car.getInsurance() != null){
                    System.out.println("Insurance name: " + car.getInsurance().getInsuranceName());
                }
            }
        }*/
        Optional<Person> optPerson = Optional.of(p1);
        Optional<String> insurance = optPerson.map(Person::getCar)
                                                .map(Car::getInsurance)
                                                .map(Insurance::getInsuranceName);
        System.out.println(insurance.orElse("No insurance"));
    }
}
