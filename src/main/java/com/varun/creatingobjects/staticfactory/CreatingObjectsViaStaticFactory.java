package com.varun.creatingobjects.staticfactory;

public class CreatingObjectsViaStaticFactory {
	public static void main(String[] args) {
		Person p1 = Person.createPerson(1, "varun", "bele", "US");
		Person p2 = Person.createPersonWithDefaultCountry(2, "san", "bosse");
		Person p3 = Person.createPersonWithLoggedInstantiationTime(1, "varun", "bele", "US");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
