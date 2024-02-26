package org.methodoverriding.java;

class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Barking");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Animal a= new Dog();
		a.eat();
		

	}

}
