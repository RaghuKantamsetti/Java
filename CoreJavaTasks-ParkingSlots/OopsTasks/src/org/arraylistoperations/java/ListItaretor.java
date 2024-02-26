package org.arraylistoperations.java;


import java.util.*;

public class ListItaretor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		ArrayList<String> list= new ArrayList<String>();
		list.add("raghu");
		list.add("Pavan");
		list.add("kumar");
		list.add("sai");
		list.add("king");
		list.add("king kohli");
		list.add(2,"nani");// adding elements to specific index
		ListIterator<String> itr=list.listIterator();//iterate using listIterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(" ArrayList in descending order: "+list);
		
		System.out.println("insert an element to ArrayList using ListIterator.........");
		ListIterator<String> i=list.listIterator();//iterate using listIterator
		while(i.hasNext()) {
			i.add(sc.next());
			i.next();	
			break;
			
		}
		System.out.println(list);
		System.out.println("replace an element at specified index arraylist........");
		list.set(0, "ro");
		System.out.println(list);
		
		if (list.contains("ro")) {
			System.out.println("element found in list");
		}
		list.remove("king");
		System.out.println("list after removing king object: "+list);
		
	}
}
