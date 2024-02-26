package org.collectionsexamples.java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet <String> arrlist=new HashSet<>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.add("kohli");
		arrlist.add("kohli");
		arrlist.add(null);
		arrlist.add(null);
		System.out.println(arrlist);
		arrlist.forEach(System.out::println);
		
		Iterator <String> itr=arrlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
