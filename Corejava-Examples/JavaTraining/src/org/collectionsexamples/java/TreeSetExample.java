package org.collectionsexamples.java;

import java.util.*;
import java.util.Iterator;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet <String> arrlist=new TreeSet<>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.add("kohli");
		arrlist.add("kohli");
		
		System.out.println(arrlist);
		System.out.println("..........");
		arrlist.forEach(System.out::println);
		System.out.println("..........");
		Iterator <String> itr=arrlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
