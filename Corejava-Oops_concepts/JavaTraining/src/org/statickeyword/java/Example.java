package org.statickeyword.java;

public class Example{  	int rollno;  
	String name;  
	static String college = "ITS";  
	//static method to change the value of static variable  
	static void change(){  
		college = "BBDIT";  
		System.out.println("colege name changed");
	}  
	//constructor to initialize the variable  
	Example(int r, String n){  
		rollno = r;  
		name = n;  
	}  
	//method to display values  
	void display(){
		System.out.println(rollno+" "+name+" "+college);
		}  

//Test class to create and display the values of object  

	public static void main(String []args){  
		//calling change method  
		//creating objects  
		
		Example s1 = new Example(111,"Karan");  
		Example s2 = new Example(222,"Aryan");  
		Example s3 = new Example(333,"Sonoo");  
		//calling display method 
		change();
		s1.display();  
		s2.display();  
		s3.display();  

	}
}  

