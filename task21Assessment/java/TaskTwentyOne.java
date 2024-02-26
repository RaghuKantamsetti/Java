package org.task21Assessment.java;

import java.util.Scanner;

/*Class named Operations have final variables like plus,minus,divide and multiply.
This class has a method named calculate which takes 2 inputs of type double and return value in double
inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
AssertionError is also thrown when user doesn't perform any of these operations in default.
In your main method: calculate all 4 results and have these printed in console.
Make sure to have dynamic inputs.*/

public class TaskTwentyOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operations ops=new Operations();
		System.out.println("enter your operation 0 for plus,1 for minus,2 for division,3 for multi: ");
		int  i=sc.nextInt();
		if (i==1||i==0||i==2||i==3) {
			double t=ops.calculate(i, sc.nextDouble(), sc.nextDouble());
			System.out.println(t);
		}
		else {
			try {
				throw new AssertionError(" AssertionError");
			}
			catch(AssertionError r) {
				System.out.println(r);
			}
		}



	}

}
