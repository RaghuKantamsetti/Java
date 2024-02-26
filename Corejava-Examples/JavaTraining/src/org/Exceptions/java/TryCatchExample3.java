package org.Exceptions.java;

public class TryCatchExample3 {

	public static void main(String[] args) {
		int i=10,j=0,c;
		try {
			c=i/j;
		}
		catch(Exception r) {
			c=i/(j+2);
			System.out.println(c);//Exception resolved on catch block
		}
	}

}
