package org.schoolmedals.java;

import java.util.Scanner;

/*problem statemnt 17: A school offers medals to the students of tenth based on the following criteria
If(Marks>=90) : Gold
If(Marks between 80 and 90) : Silver
If(Marks between 70 and 80) : Bronze
Note: Marks between 80 and 90 means marks>=80 and marks<90
Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible
 for the medals along with type of medal.
The input hashmap contains the student registration number as key and mark as value.
The output hashmap should contain the student registration number as key and the medal type as value.*/

public class SchoolMedalsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medals md=new Medals();
		System.out.println("Enter no of Students: ");
		md.method(sc.nextInt());
		sc.close();
	}

}
