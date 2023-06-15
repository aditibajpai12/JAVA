package com.rays.shapearray;

public class Triangle extends Shape{
	private int base;
	private int height;
	public void setbase(int base) {
		this.base = base;
		
		
	}
	public int getBase() {
		return base ;
		
	}
	public void setHeight(int height) {
		this.height = height;
		
		
	}
	public int getHeight() {
		return height;
		
	}
	public double area () {
		double area = base*height/2;
		System.out.println("Area of triangle = "+area);
		return area;
    	
    }

	
	}
