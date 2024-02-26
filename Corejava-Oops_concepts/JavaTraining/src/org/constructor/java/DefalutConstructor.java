package org.constructor.java;

public class DefalutConstructor {
	int id;
	String name;
	public void display(){
		System.out.println(id+" and "+name);
	}

	public static void main(String[] args) {
		DefalutConstructor b = new DefalutConstructor();
		b.display();
	}

}
//in this program we are not providing any constructor but java compiler provides default constructor thats why here 
//prints default values