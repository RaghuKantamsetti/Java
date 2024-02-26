package org.constructor.java;


public class ConstructorExampleThree {
	//Constructor overload
	int id;
	String name;
	int age;
	ConstructorExampleThree(int i,String s){
		id =i;
		name=s;
	}
	ConstructorExampleThree(int i,String s,int a){
		id=i;
		name=s;
		age=a;
	}
	public void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		ConstructorExampleThree o1=new 	ConstructorExampleThree(100,"Raghu");
		ConstructorExampleThree o2=new 	ConstructorExampleThree(100,"Ram",99);
		o1.display();
		o2.display();


		
	}

}
