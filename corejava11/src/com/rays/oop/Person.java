package com.rays.oop;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String Address;
	public static final int AVG_AGE = 21;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getAdress() {
		return Address;

	}

	public int getAge() {
		return AVG_AGE;

	}

}
