package org.collectionsexamples.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Comparable> list=new LinkedList();
		list.add(100);
		list.add("virat");
		list.set(0, "king");
		list.forEach(System.out::println);  
		System.out.println(list);
		System.out.println("using forloop");
		
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("using forEach");
		for (Comparable i:list) {
			System.out.println(i);
		}
		Iterator itr=list.iterator();
		System.out.println("using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator i=list.descendingIterator();
		System.out.println("using iterator reverse");
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		//Inter conversion between collection objects
		ArrayList conversion =new ArrayList(list);
		
		
	}

}
