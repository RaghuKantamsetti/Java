package org.collectionstasks.java;

import java.util.*;

//Wite a Java program to create read only data using List, Set and Map in example

public class CreateCollections {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		HashSet <String>set=new HashSet<>();
		HashMap<Integer,String> map=new HashMap<>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.add("king");
		arrlist.add("king kohli");
		System.out.println("list........");
		System.out.println(arrlist);
		set.add("raghu");
		set.add("Pavan");
		set.add("kumar");
		set.add("sai");
		set.add("king");
		set.add("king kohli");
		System.out.println("set........");
		System.out.println(set);
		map.put(1, "virat");
		map.put(2, "rohit");
		System.out.println("map........");
		System.out.println(map);
		
	}

}
