package org.Exceptions.java;

public class TryCatchExampleTwo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			System.out.println(arr[5]);
		}
		catch(Exception r) {
			System.out.println(r);
		}
		System.out.println(arr[4]);
	}

}
