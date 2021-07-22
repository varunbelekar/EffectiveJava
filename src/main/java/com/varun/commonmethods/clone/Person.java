package com.varun.commonmethods.clone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Person implements Cloneable, Comparable<Person>{
	private Integer id;
	private String firstName;
	private String lastName;
	private List<String> countriesVisited;
	private static final Comparator<Person> PERSON_COMPARATOR = Comparator.comparing(Person::getId)
																		  .thenComparing(Person::getFirstName)
																		  .thenComparing(Person::getLastName);
	
	public Person(Integer id, String firstName, String lastName, List<String> countriesVisited) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.countriesVisited = countriesVisited;
	}
	
	public Person(Person person) {
		this(person.id, person.firstName, person.lastName, new ArrayList<String>(person.countriesVisited));
	}
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getCountriesVisited() {
		return countriesVisited;
	}
	public void setCountriesVisited(List<String> countriesVisited) {
		this.countriesVisited = countriesVisited;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", countriesVisited="
				+ countriesVisited + "]";
	}

	@Override
	public Person clone()  {
		try {
			Person copy = (Person)super.clone();
			copy.countriesVisited = new ArrayList<String>();
			for (String country : countriesVisited) {
				copy.countriesVisited.add(country);
			}
			return copy;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	@Override
	public int compareTo(Person person) {
		return PERSON_COMPARATOR.compare(this, person);
	}
	
	
	
}
