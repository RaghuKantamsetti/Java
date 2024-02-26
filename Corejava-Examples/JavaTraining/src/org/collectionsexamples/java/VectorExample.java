package org.collectionsexamples.java;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector <String> arrlist= new Vector<String>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.set(2,"nani");
		arrlist.add("king");
		arrlist.add("king kohli");
		arrlist.remove("king");
		System.out.println(arrlist);
		System.out.println( "using forloop....");
		for (int i=0;i<arrlist.size();i++) {
			System.out.println(arrlist.get(i));
		}
		System.out.println("for each......");
		for(String i:arrlist) {
			System.out.println(i);
		}
		Iterator<String> i=arrlist.iterator();
		System.out.println("using iterator.......");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
