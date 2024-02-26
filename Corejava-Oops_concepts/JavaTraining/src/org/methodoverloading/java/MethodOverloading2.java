package org.methodoverloading.java;

class Multiply{
	static int mul(int a,int b,int c) {
		return a*b*c;
	}
	static int mul(int a,int b) {
		return a*b;
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		System.out.println(Multiply.mul(2, 2,3));
		System.out.println(Multiply.mul(2, 3));
		
	}

}
