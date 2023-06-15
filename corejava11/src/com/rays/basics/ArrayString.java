package com.rays.basics;

public class ArrayString {
	public static void main(String[] args) {
		String[] name = { "aditi", "urvashi", "hello", "bye" };
		int count = 0;
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length(); j++) {
				if (name[i].charAt(j) == 'z') {
					count++;

				}
			}
		}
		System.out.println("count=" + count);

	}
}
