package com.rays.constructor;

public class ConstructorRectangle extends Shape {
	private int length;
	private int width;
	
	public ConstructorRectangle(int length, int width) {
		this.length=length;
		this.width=width;
		}
	public int getLength() {
		return length;
		
	}
	public int getWidth() {
		return width;
		
	}
	public double area() {
		double area = length*width;
		System.out.println("Area of rectangle = "+area);
		return area;
		
	}
	

}
