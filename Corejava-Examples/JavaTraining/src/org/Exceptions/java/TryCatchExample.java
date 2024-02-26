package org.Exceptions.java;

public class TryCatchExample {

	public static void main(String[] args) {
		int i=1/0;
		System.out.println(i);
	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at org.Exceptions.java.TryCatchExample.main(TryCatchExample.java:6)
//it throws this type of exception
