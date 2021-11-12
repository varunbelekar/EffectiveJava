package com.varun.references;

import com.varun.commonmethods.clone.Person;

import java.util.ArrayList;
import java.util.List;

public class ReferncesTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(1, "Varun", "Bel", null);
        personList.add(p1);
        System.out.println(personList);
        //p1 = null;
        //System.out.println(personList); List remains unchanged
        p1.setLastName("Belekar");
        System.out.println(personList);//List  changes
    }
}
