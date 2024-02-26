package org.Exceptions.java;

public class TryCatchExampleOne {

	public static void main(String[] args) {
		try {
			int i=1/0;
		}catch(ArithmeticException r) {
			System.out.println(r);
		}
		System.out.println("Rest of the code");
	}	
	

}
