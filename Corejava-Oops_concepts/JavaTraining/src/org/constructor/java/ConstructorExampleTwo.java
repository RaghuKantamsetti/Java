package org.constructor.java;

public class ConstructorExampleTwo {
	int id;
	String name;
	ConstructorExampleTwo(int i,String s){
		id=i;
		name=s;
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ConstructorExampleTwo obj1=new ConstructorExampleTwo(100,"Raghu");
		ConstructorExampleTwo obj2=new ConstructorExampleTwo(101,"Ram");
		

	}

}
