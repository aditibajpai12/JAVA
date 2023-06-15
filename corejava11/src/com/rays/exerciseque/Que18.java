package com.rays.exerciseque;

public class Que18 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 40, 100, 88, 1000, 999, 10 };
		int number = 100;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				index = i;
			}
		}
		System.out.println(index);
		System.out.println("Number = " +number);
	}
}
