package org.boxtasks.java;

public class BoxMain {

	public static void main(String[] args) {
		Box3d b=new Box3d(1d,2d,3d);
		Box b1=new Box(5d,6d,3d);
		b.area();
		b1.area1();
		b.volume();
		b1.volume1();
	}
}
