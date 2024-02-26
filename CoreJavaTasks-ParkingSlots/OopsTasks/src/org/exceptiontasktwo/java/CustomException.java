package org.exceptiontasktwo.java;

import java.util.ArrayList;
import java.util.Scanner;


class InvalidEmployeeId extends Exception{
	
	public InvalidEmployeeId(String s) {
		super(s);
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeEntries b=new EmployeeEntries("raghu",100,"tholeru");
		EmployeeEntries b1=new EmployeeEntries("pavan",101,"tholeru");
		EmployeeEntries b2=new EmployeeEntries("kumar",102,"tholeru");

		ArrayList<EmployeeEntries> list=new ArrayList<EmployeeEntries>();
		
		list.add(b);
		list.add(b1);
		list.add(b2);
		System.out.println("Please provide your id  :");
		int ide=sc.nextInt();
		for(EmployeeEntries i: list) {
			if (i.id == ide) {
				System.out.println("Welcome to office "+i.name);
			    return;
			}
		}
		try {
			throw new InvalidEmployeeId(" Sorry need Access");
			}
		catch(InvalidEmployeeId r) {
			System.out.println(r);
					
			}
	}

	
}


