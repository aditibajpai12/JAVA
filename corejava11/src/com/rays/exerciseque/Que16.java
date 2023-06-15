package com.rays.exerciseque;

public class Que16 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 1, 80, 12, 40 };
		int a = 0;
		int b = arr[0];
		
		for (int i= 0; i < arr.length; i++) {
			if (arr[i] > b) {
				a = b;
				b = arr[i];
			}
			if(a<arr[i]&&b>arr[i]) {
				a=arr[i];
				System.out.println(a);}
		
		}
		}
	}
		

