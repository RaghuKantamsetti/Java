package org.task19assessment.java;

import java.util.Scanner;
import java.util.regex.Pattern;

// Implement an exception "InvalidUserName".
//User inputs his UserName in console. When length of userName is <10 or if it has "&", this should be handled by the exception.


public class CustomExceptionMain {

	public static void main(String[] args) throws InvalidUserName {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] list=s.toCharArray();
		for(char ch:list) {
			if (s.length()> 10 ) {
				if (ch=='&') {

					try {
						throw new InvalidUserName("InvalidUserName");
					}
					catch(Exception e) {
						System.out.println(e);
						return;
					}
				}
			}
			else {
				try {
					throw new InvalidUserName("InvalidUserName");
				}
				catch(Exception e) {
					System.out.println(e);
					return;
				}
				
			}
		}
		System.out.println("valid userName");

	}
}


