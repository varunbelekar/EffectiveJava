package com.varun.generic.boundedwildcards;

import java.util.List;

public class BoundedWildcards {
	public static void main(String[] args) {
		List<Number> numbers = List.of(1, 2, 3);
		printList(numbers);
		List<Integer> integers = List.of(1, 2, 3);
		printListOfNumbers(integers);
	}
	
	public static void printList(List<? super Integer> list) {
		list.forEach(System.out::println);
	}
	
	public static void printListOfNumbers(List<? extends Number> list) {
		list.forEach(System.out::println);
	}
}


