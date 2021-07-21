package com.varun.commonmethods.equals;

public class PhoneNumber {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (! (obj instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) obj;
		return pn.areaCode == areaCode && pn.lineNumber == lineNumber && pn.prefix == prefix;
	}
	
	public static void main(String[] args) {
		PhoneNumber phoneNumber1 = new PhoneNumber(1, 91, 5555);
		PhoneNumber phoneNumber2 = new PhoneNumber(1, 91, 5555);
		System.out.println(phoneNumber1.equals(phoneNumber2));
	}
}
