package com.rays.string;

public class Hello {
	public void sum() {
		String s = "Hello :)";
		System.out.println(s);
	}

	public int sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;

	}

	public static int max(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		return b;
	}

}
