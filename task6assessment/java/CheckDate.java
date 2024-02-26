package org.task6assessment.java;

import java.util.Scanner;

/*User should be asked to enter any date.
1 method checks if input date is earlier to present date.
1 method checks if input date is after to present date.
1 method converts given date into "yyyy-MM-dd HH:mm:ssZ" pattern.*/


public class CheckDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Checker c=new Checker();
		System.out.println("Enter date to check: ");
		String s=sc.nextLine();
		c.AfterOrNot(s);
		c.earlierOrNot(s);
		c.converter(s);
	}

}