package com.varun.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EmployeeReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Employee employee = new Employee(); Constructor is private
        Constructor<Employee> employeeConstructor = Employee.class.getDeclaredConstructor();
        employeeConstructor.setAccessible(true);
        Employee employee = employeeConstructor.newInstance();
        System.out.println(employee);
        Employee employee2 = employeeConstructor.newInstance();
        System.out.println(employee2);
    }
}
