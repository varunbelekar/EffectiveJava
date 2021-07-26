package com.varun.classes.mutability;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = Complex.valueOf(1, 5);
		Complex c2 = Complex.valueOf(2.213312, 7);
		Complex c3 = c1.minus(c2);
		System.out.println(c3);
	}
}
