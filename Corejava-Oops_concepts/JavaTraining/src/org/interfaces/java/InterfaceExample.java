package org.interfaces.java;
interface Bike{
	void start();
}
class Hero implements Bike{
	public void start() {
		System.out.println("bike started...");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Hero b=new Hero();
		b.start();
	}

}
