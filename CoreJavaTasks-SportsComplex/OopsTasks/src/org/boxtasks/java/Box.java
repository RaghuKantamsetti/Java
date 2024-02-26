package org.boxtasks.java;

public class Box {
	double l, b, h;
	Box(double l,double b,double h ) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void area1() {
		double ar=2*((l*b)+(l*h)+(b*h));
		System.out.println(ar+" area box");
	}
	public void volume1() {
		double vol=l*b*h;
		System.out.println(vol+" vol of box");
}
}
