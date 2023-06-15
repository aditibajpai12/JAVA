package com.rays.comparableandcomparator;

import java.util.Comparator;

public class OrderById implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
		
		//return o1.name.compareTo(o2.name);
	}

}
