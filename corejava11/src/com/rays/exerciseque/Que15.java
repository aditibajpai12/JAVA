package com.rays.exerciseque;

public class Que15 {
	public static void main(String[] args) {
		int[]arr = {9,5,7,3,67,33,99,24,102,1};
		int a=0;
		int max= arr[a];
		for(int i=0;i<arr.length;i++) {
			if(arr[a]<arr[i]) {
				arr[a]=arr[i];
			}
		}
		System.out.println("Maximum Number=" +arr[a]);
		System.out.println(max);
	}

}
