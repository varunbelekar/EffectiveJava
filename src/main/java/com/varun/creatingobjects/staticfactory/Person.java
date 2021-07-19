package com.varun.creatingobjects.staticfactory;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String country;
	
	public Person(int id, String firstName, String lastName, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public static Person createPerson(int id, String firstName, String lastName, String country) {
		return new Person(id, firstName, lastName, country);
	}
	
	public static Person createPersonWithDefaultCountry(int id, String firstName, String lastName) {
		return new Person(id, firstName, lastName, "India");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ "]";
	}
	
	
	
}
