package com.rays.constructor;
public class ConsTestClass {
	public static void main(String[] args) {
		Shape[]s = new Shape[3];
		s[0] = new ConstructorRectangle(10, 20);
		s[1] = new ConstructorCircle(20, 10);
		s[2]= new ConstructorTriangle(10, 20);
		
		double totalarea = 0;
		for(int i=0;i<s.length;i++) {
		 totalarea = totalarea+s[i].area();
		}
			System.out.println("Total Area=" +totalarea);
			
 
	
	
	
	
	
	}
}