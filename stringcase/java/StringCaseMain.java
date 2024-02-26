package org.stringcase.java;

import java.util.Scanner;

/*problem statement 18:
 Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
Return the resulting array.
Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE*/


public class StringCaseMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ChangingStrings ch=new ChangingStrings();
		ch.method(sc.nextInt());
	}

}
