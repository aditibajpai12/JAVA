package com.rays.basics;

public class AtoZcount {
	public static void main(String[] args) {
		String name="aditi bajpai";
		int count=0;
		for(char c='a';c<='z';c++) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==c) {
					count++;
				}
				
			}
			
			System.out.println(c+ "="+count);
			count=0;
		
		
	}

	}
}
