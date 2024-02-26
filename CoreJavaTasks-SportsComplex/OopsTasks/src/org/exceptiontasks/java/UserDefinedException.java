package org.exceptiontasks.java;

import java.util.Scanner;

// Write a program for creation of user defined exception.

class SlotNotFoundException extends Exception 
{
	public SlotNotFoundException(String s) {
		super(s);
	}
	
}

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide info about pass for slot for yes press 1 or for  no press 0  :");
		int i=sc.nextInt();
		if (i==0) {
			try {
				throw new SlotNotFoundException(" you have no access to slot");
			}
			catch(SlotNotFoundException r) {
				System.out.println(r.getMessage());
			}
		}
		else {
			System.out.println("you have access now you can go to your slot");
		}
	}

}
