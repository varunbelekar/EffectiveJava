package com.varun.streams;

import java.math.BigInteger;
import java.util.stream.Stream;

public class MersenePrime {
	public static void main(String[] args) {
//		primes().map(p -> BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
//				.filter(mersene -> mersene.isProbablePrime(50))
//				.limit(20)
//				.forEach(System.out::println);
		
		System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"));
	}
	
	public static Stream<BigInteger> primes() {
		return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
	}
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
//		     return Stream.of(names)
//						  .filter(name -> name.length() > 5)
//						  .map(String::length)
//						  .reduce(Integer::sum)
//						  .orElse(0);
		
		return Stream.of(names)
					 .filter(name -> name.length() > 5)
					 .mapToInt(String::length)//Prefer IntStream to prevent unnecessary unboxing.
					 .sum();
	}
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFiveWithoutStreams(String... names) {
		int sum = 0;
		for (String string : names) {
			if (string.length() > 5) {
				sum += string.length();
			}
		}
		return sum;
}
}
