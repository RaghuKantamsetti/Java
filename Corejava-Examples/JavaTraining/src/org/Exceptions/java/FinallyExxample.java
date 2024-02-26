package org.Exceptions.java;
// program for finally block "When an exception occurs" 
public class FinallyExxample {

	public static void main(String[] args) {
		int i=10,j=0;
		try {
			System.out.println("Enterd try block");
			int c=i/j;
		}
		catch(ArithmeticException r) {
			System.out.println(r);
		}
		finally {
			System.out.println("IMP statement");
		}
	}

}
