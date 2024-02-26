package org.shapes.java;

public class Square extends Shape{
	
	public void area(double a) {
		
		System.out.println("Area of square "+(a*a));
	}
	
	public void perimeter(double a) {
		
		System.out.println("perimeter of Square "+(4*a));
	}
}