package com.rays.basics;

public class Palindrome {
	public static void main(String[] args) {
		int number = 121;
		int r = 0;
		int sum = 0;
		int n = number;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (number == sum) {

			System.out.println("Palindrome Number " +  sum);
		}

		else {
			System.out.println("Not Palindrome Number " + sum);
		}

	}
}
