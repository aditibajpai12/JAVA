package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		String s = ("06/11/2001");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		
		//System.out.println(p.AVG_AGE);
		p.setName("Aditi Bajpai");
		System.out.println("Name: " +p.getName());
		p.setAddress("Indore");
		System.out.println("Address : " +p.getAdress());
		System.out.println("Age: " +p.getAge());
		p.setDob(d);
	
		System.out.println(sdf.format(p.getDob()));
		
	}

}
