package org.polymorphism1.java;

public class Shopping {

	public static void main(String[] args) {
		ShopOne ob = new ShopTwo();//when you go to near shop
		ShopOne b = new ShopOne();//When you are go to town shop
		ob.jeans();
		b.jeans();
	}

}
