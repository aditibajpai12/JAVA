package com.rays.oop;

public class TestAutoMobile {
	public static void main(String[] args) {
		AutoMobile a = new AutoMobile();
		a.setColor("Black");
		System.out.println("Color : " +a.getColor());
		
		a.setMake("KIA");
		System.out.println("Make : " +a.getMake());
		
		a.setSpeed(85);
		System.out.println("speed : " +a.getSpeed());
		
		a.getBreak();
		
	}

}
