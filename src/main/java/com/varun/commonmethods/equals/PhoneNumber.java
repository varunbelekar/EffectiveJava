package com.varun.commonmethods.equals;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumber implements Cloneable{
	private int areaCode;
	private int prefix;
	private int lineNumber;
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNumber = lineNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaCode;
		result = prime * result + lineNumber;
		result = prime * result + prefix;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNumber != other.lineNumber)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "PhoneNumber [areaCode=" + areaCode + ", prefix=" + prefix + ", lineNumber=" + lineNumber + "]";
	}
	
	@Override
	public PhoneNumber clone() {
		try {
			return (PhoneNumber)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	public static void main(String[] args) {
		PhoneNumber phoneNumber1 = new PhoneNumber(1, 91, 5555);
		PhoneNumber phoneNumber2 = new PhoneNumber(1, 91, 5555);
		System.out.println(phoneNumber1.equals(phoneNumber2));
		
		Set<PhoneNumber> phoneNumbers = new HashSet<PhoneNumber>();
		phoneNumbers.add(phoneNumber1);
		phoneNumbers.add(phoneNumber2);
		
		System.out.println(phoneNumbers);
		
		PhoneNumber phoneNumber3 = phoneNumber1.clone();
		phoneNumbers.add(phoneNumber3);
		System.out.println(phoneNumber3.equals(phoneNumber1));
		System.out.println(phoneNumbers.size());
	}
}
