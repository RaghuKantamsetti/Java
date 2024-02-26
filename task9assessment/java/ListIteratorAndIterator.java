package org.task9assessment.java;

//Perform analysis on ListIterator and Iterator and provide your handson examples on each analysis.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorAndIterator {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("raghu");
		arrlist.add("Pavan");
		arrlist.add("kumar");
		arrlist.add("sai");
		arrlist.add("king");
		arrlist.add("king kohli");

		Iterator<String> i=arrlist.iterator();
		System.out.println("using iterator");
		while(i.hasNext()) {
			String s=i.next();
			if(s=="king") {
				i.remove();	}		  // we can remove object	
			System.out.println(s);     // Using Iterator we can read objects one by one
		}
		ListIterator <String> itr=arrlist.listIterator(arrlist.size());   //"using Listiterator in reverse order"
		System.out.println("using iterator in reverse order");
		while(itr.hasPrevious()) {
			String str=itr.previous();
			System.out.println(str);
		}
		itr.add("rohit");

	}
}
