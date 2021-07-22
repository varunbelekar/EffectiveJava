package com.varun.commonmethods.clone;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		List<String> countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("finland");
		Person person = new Person(1, "varun", "belekar", countryList);
		Person copy = person.clone();
		Person copyUsingConstructor = new Person(person);
		countryList.add("Qatar");
		System.out.println(person);
		System.out.println(copy);
		System.out.println(copyUsingConstructor);
	}
}
