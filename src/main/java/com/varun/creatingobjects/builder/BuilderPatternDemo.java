package com.varun.creatingobjects.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount.Builder(1013555)
											  .withOwner("varun")
											  .withBalance(100000L)
											  .withBranch("Mulund")
											  .withInterestRate(7.5)
											  .build();
		System.out.println(account1);
		
		BankAccount account2 = new BankAccount.Builder(1013555)
				  .withOwner("varun")
				  .withBalance(100000L)
				  .withInterestRate(7.5)
				  .build();
		System.out.println(account2);
	}
}
