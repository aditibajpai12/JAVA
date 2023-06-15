package com.rays.collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person(1,"aditi","indore");
		Person p2 = new Person(2,"urvashi","ujjain");
		Person p3 = new Person(1,"aditi","indore");
		
		
		System.out.println(p1);
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashcode());
		System.out.println(p3.hashcode());
		List list = new  ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
