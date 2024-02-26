
package org.methodoverloading.java;

class Adding{
	int add(int a,int b) {
		return a-b;
	}
	double add(double a,double b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Adding d=new Adding();
		System.out.println(d.add(10,10));
		System.out.println(d.add(10.0,10.0));
		
		
		
	}

}
