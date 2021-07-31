package com.varun.generic.rawtypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RawTypeTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//unsafeAdd(list, Integer.valueOf(5)); //List<String> is subtype of RAW List not a subtype of List<Object>
		String string = list.get(0);
	}
	
	public static void unsafeAdd(List<Object> list, Object arg) {
		list.add(arg);
	}
	
	// Use of raw type for unknown element type - don't do this!
	static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1)
		if (s2.contains(o1))
		result++;
		return result;
	}
	
	// Uses unbounded wildcard type - typesafe and flexible
	static int numElementsInCommonWildCard(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1)
		if (s2.contains(o1))
		result++;
		return result;
	}
}
