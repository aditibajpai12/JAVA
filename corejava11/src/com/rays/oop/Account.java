package com.rays.oop;

public class Account {
	private int balance = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	private String accountNumber = null;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {

		return accountNumber;
	}

	public int deposite(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		return total;
	}

	public void withdrawl(int amount) {
		int total = getBalance() - amount;
		if (total < 2000) {
			System.err.println(" Insuffitient Balance...!!!" + total);
		} else {
			System.out.println("Balance = " + total);
		}
	}

}
