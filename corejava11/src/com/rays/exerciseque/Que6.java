package com.rays.exerciseque;

public class Que6 {
	public static void main(String[] args) {
		int a=0;
		int b=1,c;
		int n =10;
		System.out.println(a);
		System.out.println(b);
		for(int i =2;i<n;++i) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			
		}
	}

}
