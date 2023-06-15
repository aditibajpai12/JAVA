package com.rays.basics;


public class String1 {
	public static void main(String[] args) {
		String[] s = { "aditi", "urvashi", "hello" };
		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s[i].length(); j++) {

				System.out.println(s[i].charAt(j));

			}

		}

	}
}