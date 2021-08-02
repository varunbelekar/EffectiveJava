package com.varun.generic.genericmethods;

import java.util.function.UnaryOperator;

public class GenericSingletonFactory {
	private static UnaryOperator<Object> IDENTITY_FN = t -> t;
	
	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>)IDENTITY_FN;
	}
	
	public static void main(String[] args) {
		String[] strings = { "jute", "hemp", "nylon" };
		UnaryOperator<String> sameString = identityFunction();
		for (String string : strings) {
			System.out.println(sameString.apply(string));
		}
		Number[] numbers = { 1, 2.0, 3L };
		UnaryOperator<Number> sameNumber = identityFunction();
		for (Number n : numbers) {
			System.out.println(sameNumber.apply(n));
		}
		
	}
}
