package org.exceptiontasks.java;

import java.util.Scanner;

//Write a program for example of multiple catch statements occurring in a program.
	
public class ExceptionTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		i=sc.nextInt();
		j=sc.nextInt();
		int[] arr = new int[5];                                                        
		try {
			arr[5]=i/j;
		}
		catch(ArithmeticException r) {
			//System.out.println("ArithmeticException change the values of i and j num is not div by zero");	
			//System.out.println(r.getMessage());
			r.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("ArrayIndexOutOfBoundsException check the array size");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		for (int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		sc.close();
	}

}


