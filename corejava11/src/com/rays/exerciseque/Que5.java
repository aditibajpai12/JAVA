package com.rays.exerciseque;

public class Que5 {
	public static void main(String[] args) {
		int number= 180;
		int r = 0;
		int sum = 0;
		int n = number;
		while(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		 System.out.println("Reverse Number=" +sum);

}
}
