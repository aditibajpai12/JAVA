package com.rays.shapearray;

public class Circle extends Shape{
	private int radius;
	public static final double PI = 3.14;
	public void setRadius(int radius) {
		this.radius= radius;
		
		
	}
	public int getRadius() {
		return radius;
		
	}
	public double getPI() {
		return PI;
	}
		public double area () {
			double area = PI*radius*radius;
			System.out.println("Area of circle = "+area);
			return area;
	    	
	    }

	}
	
