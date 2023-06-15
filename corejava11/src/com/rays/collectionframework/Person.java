package com.rays.collectionframework;

import java.util.Collection;

public class Person {
	private int id;
	private String name;
	private String address;

	public Person(int id, String name, String address) {
		this.address = address;
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return id + " " + name + " " + address;

	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			System.out.println("In Instance");
			return false;
		}
		Person p = (Person) obj;
		boolean b = this.id==p.id&&this.name==p.name &&this.address== p.address;
		return b;
			}
	public int hashcode() {
		String str = id+name+address;
		return str.hashCode();
		
	}

	
}
