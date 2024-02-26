package org.boxtasks.java;

public class Box3d extends Box{
	double l, b, h;
	
	Box3d(double l,double b,double h) {
		super( l, b, h);
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void area() {
		double ar=2*((l*b)+(l*h)+(b*h));
		System.out.println(ar+" area of box3d");
	}
	public void volume() {
		double vol=l*b*h;
		System.out.println(vol+" vol of box3d");
}}
