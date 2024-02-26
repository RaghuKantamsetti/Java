package org.shapes.java;

import java.util.Scanner;

public class ShapesMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s=new Shape();
		Circle cir=new Circle();
		Triangle tri =new Triangle();
		Square squ=new Square();
		s.area();
		s.perimeter();
		squ.area(5d);
		System.out.println(tri.area(5.5d,4.5f)+" this is area of triangle");
	}

}
