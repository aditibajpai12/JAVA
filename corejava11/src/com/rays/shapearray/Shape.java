package com.rays.shapearray;

public class Shape {
	private String color;
	private int borderwidth;
	public void setName(String color) {
		this.color = color;
	}

	public String getcolor() {
		return color;
		
    }

	public void setborderWidth(int borderwidth) {
		this.borderwidth= borderwidth;
	}

	public int getborderwidth() {
		return borderwidth;
	}

 public double area() {
	 System.out.println("Area Method");
	return 0;
	 
 }
}


