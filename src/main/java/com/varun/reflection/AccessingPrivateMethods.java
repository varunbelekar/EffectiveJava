package com.varun.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person("Varun");

        Method method = person.getClass().getDeclaredMethod("getName");
        method.setAccessible(true);

        System.out.println(method.invoke(person));

    }
}
