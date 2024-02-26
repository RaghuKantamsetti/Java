package org.flowcontrols.java;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		if (i%3==0 && i%5==0) {
			System.out.println("Fizz Buzz");
		}
		else if(i%3==0) {
			System.out.println("Fizz");
		}
		else if (i%5==0) {
			System.out.println("Buzz");
		sc.close();
		}
	}

}
