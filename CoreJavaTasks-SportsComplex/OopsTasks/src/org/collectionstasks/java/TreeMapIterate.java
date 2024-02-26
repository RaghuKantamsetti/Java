package org.collectionstasks.java;

import java.util.*;

public class TreeMapIterate {

	public static void main(String[] args) {
		TreeMap <Integer,String> map=new TreeMap<>();
		map.put(1,"virat");
		map.put(2,"pant");
		map.put(3,"rohit");
		map.put(4,"jaddu");
		map.put(5,"rahul");
		map.put(6,"boom");
		map.put(7,"siraj");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
