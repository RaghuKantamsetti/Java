package org.flowcontrols.java;

import java.util.Scanner;

public class IfElseControls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if (i%2==0){
			System.out.println(i+" is even number");
		}
		else {
			System.out.println(i+" is odd number");
		
		sc.close();

	}}

}
