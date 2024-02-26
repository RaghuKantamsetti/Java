package org.superkey.java;

class Animal{
	String s="eating...";
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
		System.out.println(super.s);
		
	}
}
public class SuperExample {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();

	}

}
