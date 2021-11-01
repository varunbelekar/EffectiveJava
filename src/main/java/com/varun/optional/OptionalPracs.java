package com.varun.optional;

import java.util.Optional;

public class OptionalPracs {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.of(5);
        System.out.println(integer.get());
        Integer integer1 = null;
        //integer = Optional.ofNullable(integer1); --> Null pointer exception
        integer = Optional.ofNullable(integer1);
        System.out.println(integer.isPresent());
    }
}
