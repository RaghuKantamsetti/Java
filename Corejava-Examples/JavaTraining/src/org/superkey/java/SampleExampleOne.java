package org.superkey.java;
class Animal1{
	void eat() {
		System.out.println("Eating...");
	}
	
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking...");
		super.eat();
		
	}
}

public class SampleExampleOne {

	public static void main(String[] args) {
		Dog1 d= new Dog1();
		d.bark();
		
	}

}//You can use Super keyword to invoke parent class constructor also
