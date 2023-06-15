package com.rays.string;

public class Slide40 {
	public static void main(String[] args) {
		String s1 = "hii";
		System.out.println(s1);
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("I Am Aditi");
		
		System.out.println("Length :" +sb.length());
		System.out.println("Capicity :" +sb.capacity());
		System.out.println("char at:" +sb.charAt(8));
		System.out.println("index of :" +sb.indexOf("Adi"));
		System.out.println("replace:" +sb.replace(0,8,"u"));
		
		
	}

}
