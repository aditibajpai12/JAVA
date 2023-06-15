package com.rays.shapearray;

public class TestShapeArray {
	public static void main(String[] args) {
		Shape[]s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2]= new Triangle();
		Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		r.setWidth(10);
		
		Circle c = (Circle) s[1];
		c.setRadius(10);
		
		Triangle t = (Triangle) s[2];
		t.setbase(10);
		t.setHeight(10);
		double totalarea = 0;
		for(int i=0;i<s.length;i++) {
		 totalarea = totalarea+s[i].area();
		}
			System.out.println("Total Area=" +totalarea);
			
			
			
		}
		
		
	}
