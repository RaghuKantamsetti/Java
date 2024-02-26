package org.collectionstasks.java;

import java.util.*;

public class LinkedToArrayList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();//this is linkedlist
		list.add("virat");
		list.add("rohit");
		list.add("pant");
		list.add("iyer");
		list.add("jaddu");
		System.out.println("this is the linkedlist: "+list);
		//change linkedlist to Arraylist
		ArrayList<String> arrlist=new ArrayList<>(list);
		System.out.println("this is the arraylist: "+arrlist);
		
	}

}
