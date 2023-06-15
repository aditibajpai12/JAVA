package com.rays.exception;

public class AccountException {
	private int balance = 0;

	public int getBalance() {
		return balance;

	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposite(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		System.out.println("Balance after deposite =" + getBalance());

	}

	public int withdrawl(int amount) {
		int total = getBalance() - amount;
		if (total < 2000) {
			try {
				throw new LoginException();
			} catch (LoginException e) {
				System.out.println(e);
				return total;
			}

		} else {
			return total;
		}
	}
}
