package org.shapes.java;

public class Triangle extends Shape{
	
	public double area(double height,float breadth) {
		
		return (height*breadth)/2;
		
	}
	public void perimeter(double a,double b,double c) {
		
		System.out.println("perimeter Triangle "+(a+b+c));
	}
}