package com.rays.exerciseque;

public class NOTEArrange {
	public static void main(String[] args) {
		// int rs = 2000,500,200,100,50,20,10,5,2,1;
		int count = 0;
		int r = 0;
		int amt = 78826;
		while (amt >= 2000) {
			count = amt / 2000;
			amt = amt % 2000;
			System.out.println("2000 rs notes-" + count);
		}
		while (amt >= 500) {
			count = amt / 500;
			amt = amt % 500;
			System.out.println("500 rs notes-" + count);
		}
		while (amt >= 200) {
			count = amt / 200;
			amt = amt % 200;
			System.out.println("200 rs notes-" + count);
		}
		while (amt >= 100) {
			count = amt / 100;
			amt = amt % 100;
			System.out.println("100 rs notes-" + count);
		}
		while (amt >= 50) {
			count = amt / 50;
			amt = amt % 50;
			System.out.println("50 rs notes-" + count);
		}
		while (amt >= 20) {
			count = amt / 20;
			amt = amt % 20;
			System.out.println("20 rs notes-" + count);
		}
		while (amt >= 10) {
			count = amt / 10;
			amt = amt % 10;
			System.out.println("10 rs notes-" + count);
		}
		while (amt >= 5) {
			count = amt / 5;
			amt = amt % 5;
			System.out.println("5 rs coins-" + count);
		}
		while (amt >= 2) {
			count = amt / 2;
			amt = amt % 2;
			System.out.println("2 rs coins-" + count);
		}
		while (amt >= 1) {
			count = amt / 1;
			amt = amt % 1;
			System.out.println("1 rs coins-" + count);
		}
	}

}
