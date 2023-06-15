package com.rays.exception;

public class TestAccount {
public static void main(String[] args) {
	AccountException a = new AccountException();
	a.setBalance(500);
	a.withdrawl(400);
}
}
