package com.rays.constructor;
public class ConstructorCircle extends Shape{
		private int radius;
		public static final double PI = 3.14;
		public ConstructorCircle(int radius,double PI) {
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

