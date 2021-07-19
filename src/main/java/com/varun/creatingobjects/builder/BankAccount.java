package com.varun.creatingobjects.builder;


public class BankAccount {
	
	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;
	
	private BankAccount() {
		
	}
	
	public static class Builder{
		private long accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;
		
		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder withBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public Builder withInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		public BankAccount build() {
			BankAccount bankAccount = new BankAccount();
			bankAccount.accountNumber = this.accountNumber;
			bankAccount.balance = this.balance;
			bankAccount.branch = this.branch;
			bankAccount.interestRate = this.interestRate;
			bankAccount.owner = this.owner;
			return bankAccount;
		}
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}
	
	
}
