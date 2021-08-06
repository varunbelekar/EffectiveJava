package com.varun.enums;

public class EnumOperationTest {
	public static void main(String[] args) {
		System.out.println(Operation.MINUS.apply(5.45, 2.36));
		for (Operation operation : Operation.values()) {
			System.out.println(operation.apply(2, 3));
		}
	}
}	
