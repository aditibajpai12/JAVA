package com.rays.comparableandcomparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee>{
	public int id;
	public String name;
	public String address;
	public Employee(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	
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
	
	@Override
	public String toString() {
		return id+" "+name+" "+address;
		
	}
	//@Override
	//public int compareTo(Employee o) {
	//	if(this.id==o.id) {
		//	return this.name.compareTo(o.name);
		//}
		
		//return this.id-o.id;
	//}
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}

}
