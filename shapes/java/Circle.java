package org.shapes.java;

public class Circle extends Shape{
	public void area(double pi,double radius) {
		
		System.out.println("Area of circle "+(pi*radius*radius));
	}
	public void perimeter(double pi,double radius) {
		
		System.out.println("perimeter of circle "+(pi*radius*2));
	}
}

