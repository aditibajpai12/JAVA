package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(20);
		a.deposite(2000);
		a.withdrawl(500);
		a.setAccountNumber("BOI99556");
		System.out.println("Total Amount = " +a.getBalance());
		System.out.print(a.getAccountNumber());
		System.out.println(a.deposite(2000));
		
	}

}
