package com.varun.generic.genericmethods;

import java.util.HashSet;
import java.util.Set;

public class GenericMethod {
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> resultSet = new HashSet<>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}
	
	public static void main(String[] args) {
		Set<String> guys = Set.of("Tom", "Dick", "Harry");
		Set<String> stooges = Set.of("Larry", "Moe", "Curly");
		Set<String> aflCio = union(guys, stooges);
		System.out.println(aflCio);
	}
}
