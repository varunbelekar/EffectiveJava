package com.varun.annotations;


import java.lang.annotation.Annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        Nokia bees = new Nokia("Fire", 5);
        System.out.println(bees.getModel() + " " + bees.getScreenSize());

        Class c = bees.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println(smartPhone.osName() + " - " + smartPhone.version());
    }
}



