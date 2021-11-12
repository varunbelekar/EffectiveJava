package com.varun.reflection;

public class Person {
    private int id;
    private String name;

    public Person(String name){
        this.name = name;
    }

    private String getName(){
        return name;
    }
}
