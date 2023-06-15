package com.rays.exerciseque;

public class Que10 {
	public static void main(String[] args) {
		int number=152;
		int r=0;
		int sum=0;
		int n = number;
		while(n>0) {
			r =n%10;
			sum= sum+(r*r*r);
			n=n/10;
	}if(sum==number) {
		System.out.println("Armstrong=" +number);

}
	else {
		System.out.println("Not Armstrong="+number);
	}
	}
}
