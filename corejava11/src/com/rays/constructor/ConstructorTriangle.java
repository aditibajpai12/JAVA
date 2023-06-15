package com.rays.constructor;

public class ConstructorTriangle extends Shape{
	public int base;
	public int height;
	public ConstructorTriangle(int base,int height) {
		this.base=base;
		this.height=height;
		}
	public int getbase() {
		return base;
		
	}
	public int getheight() {
		return height;
		
	}
	public double area () {
		double area = base*height/2;
		System.out.println("Area of triangle = "+area);
		return area;
    	
    }
	

}
