package org.collectionstasks.java;

import java.util.*;

public class ArrayToArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.add("king");
		arrlist.add("king kohli");
		System.out.println("arrayList to Array.............");
	     Object[] arr = arrlist.toArray();
	     for (Object i:arr) {
	    	 System.out.println(i);
	     }
	     String[] arr1= {"raghu","Pavan","king kohli","sai"};
	     List al = Arrays.asList(arr1);	 
	     System.out.println("array to arrayList..............");
	     System.out.println(al);
	     
	}

}
