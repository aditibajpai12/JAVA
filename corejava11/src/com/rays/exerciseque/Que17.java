package com.rays.exerciseque;

public class Que17 {
public static void main(String[] args) {
	int[]arr1= {2,4,6,8,10};
	int[]arr2= {2,4,6,8,10,12};
	int sum1=0,sum2=0;
	for(int i = 0;i<arr1.length;i++) {
		sum1=sum1+arr1[i];
	}
	
		for(int j=0;j<arr2.length;j++) {
			sum2=sum2+arr2[j];
		}
		System.out.println("Missing Element= " +Math.abs(sum1-sum2));
			
			
		
	}
}

