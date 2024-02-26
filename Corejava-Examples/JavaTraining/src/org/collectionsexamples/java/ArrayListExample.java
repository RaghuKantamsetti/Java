package org.collectionsexamples.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.set(2,"nani");
		arrlist.add("king");
		arrlist.add("king kohli");
		arrlist.remove("king");
		System.out.println(arrlist);
		System.out.println( "using forloop");
		for (int i=0;i<arrlist.size();i++) {
			System.out.println(arrlist.get(i));
		}
		for(String i:arrlist) {
			System.out.println("for each");
			System.out.println(i);
		}
		Iterator<String> i=arrlist.iterator();
		System.out.println("using iterator");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator <String> itr=arrlist.listIterator(arrlist.size());
		System.out.println("using iterator in reverse order");
		while(itr.hasPrevious()) {
			String str=itr.previous();
			System.out.println(str);
		}
			
	}

}
