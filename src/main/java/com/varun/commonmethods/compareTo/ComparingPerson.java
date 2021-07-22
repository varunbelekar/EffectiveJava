package com.varun.commonmethods.compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.varun.commonmethods.clone.Person;

public class ComparingPerson {
	public static void main(String[] args) {
		Person person = new Person(1, "varun", "belekar", null);
		Person person2 = new Person(11, "xyz", "abc", null);
		Person person3 = new Person(1, "varun", "belekarr", null);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person2);
		persons.add(person3);
		Collections.sort(persons);
		System.out.println(persons);
	}
}
