package org.abstraction.java;
abstract class Bike{
	Bike(){  //abstract class has a constructor
		System.out.println("bike started...");
	}
	abstract void run();// abstract method
	void changeGear() {  
		System.out.println("Gear changed...");
	}
}
class Hero extends Bike{
	void run() {
		System.out.println("running safely...");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		Bike b=new Hero();
		b.run();
		b.changeGear();

	}

}
