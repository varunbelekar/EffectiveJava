package com.varun.enums;

public class PayRollEnumTest {
	public static void main(String[] args) {
		for (PayrollDay day : PayrollDay.values()) {
			System.out.printf("Pay on %s is %d %n", day, day.pay(9 * 60, 15));
		}
		
	}
}
