package org.Exceptions.java;

public class FinallyExampleOne {

	public static void main(String[] args) {
		try {
			int i=100/10;
			System.out.println(i);
		}
		catch(Exception r) {
			System.out.println(r);
		}
		finally {
			System.out.println("when an exception not occured then also finally block executed");
		}
	}

}
//When an exception is not handled by catch block then also finally block executed and program terminated abnormally