package com.rays.exerciseque;

public class Que14 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int number = 10;
		System.out.println("All the Even Number are:");
		for(int i=2;i<=number;i=i+2) {
			System.out.println(i);
			sum1=sum1+i;
			}
		sum1=sum1/(number/2);
		System.out.println("average of even number is " +sum1);

		
	for(int i=1;i<=number;i=i+2) {
		System.out.println(i);
		sum2=sum2+i;
		}
	sum2=sum2/(number/2);
	System.out.println("average of even number is " +sum2);

}
}