package com.varun.commonmethods.equals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaseInsensitiveString {
	private final String string;

	public CaseInsensitiveString(String string) {
		this.string = Objects.requireNonNull(string);
	}

	@Override
	public boolean equals(Object obj) {
		/*if (obj instanceof CaseInsensitiveString) {
			return string.equalsIgnoreCase(((CaseInsensitiveString) obj).string);
		}
		if (obj instanceof String) {//One way interoperability!
			return string.equalsIgnoreCase((String) obj);
		}
		return false;*/
		
		return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString)obj).string.equalsIgnoreCase(string);
	}
	
	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String string = "Polish";
		CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
		System.out.println(cis.equals(string));
		System.out.println(string.equals(cis));
		System.out.println(cis.equals(cis2));
		System.out.println(cis2.equals(cis));
		
		List<CaseInsensitiveString> list = new ArrayList<CaseInsensitiveString>();
		list.add(cis);
		System.out.println(list.contains(cis2));
	}
	
}
