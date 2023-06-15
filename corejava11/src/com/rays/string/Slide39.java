package com.rays.string;

public class Slide39 {
	public static void main(String[] args) {
		String s = "Hello I Am Aditi";
		System.out.println("String length - " + s.length());
		System.out.println("6th character of string-" + s.charAt(6));
		System.out.println("Adi index is-" +s.indexOf("Adi"));
		System.out.println("First index-" +s.indexOf("d"));
		System.out.println("Last index-"  +s.lastIndexOf("i"));
		System.out.println("substring-" +s.substring(11));
		System.out.println("ends with iti-" +s.endsWith("iti"));
		System.out.println("choti aditi-" +s.toLowerCase());
		System.out.println("BADI ADITI-" +s.toUpperCase());
		System.out.println(s.replace("H", "A"));
		

	}

}
