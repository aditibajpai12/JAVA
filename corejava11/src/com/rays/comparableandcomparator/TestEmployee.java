package com.rays.comparableandcomparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TestEmployee {
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(new Employee(4,"shreya","khargone"));
		list.add(new Employee(5,"urvashi","bhopal"));
		list.add(new Employee(3,"nitisha","rau"));
		list.add(new Employee(4,"aditi","indore"));
		list.add(new Employee(1,"shreni","hatod"));
		//Collections.sort(list);
		//for (Object object:list) {
			//System.out.println(object);
		//Collections.sort(list);
		Collections.sort(list, new OrderById());
		for (Object object:list) {
			System.out.println(object);
			
		}
		
		
		
	}

}
