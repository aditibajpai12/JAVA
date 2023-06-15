package com.rays.exerciseque;

public class Que7 {
	public static void main(String[] args) {
		System.out.print(" *Numbers are* : ");
		int r=0;
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%7==0) {
				sum=sum+i;
				System.out.println(i);
			}
			
			
		}
		System.out.println("Sum=" +sum);
	}

}
