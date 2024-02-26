package org.arraylistoperations.java;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();

		list.add("virat");
		list.add("rohit");
		list.add("virat");
		list.add("pant");
		list.add("iyer");
		list.add("pant");
		list.add("virat");
		list.add("jaddu");
		System.out.println("ArrayList with duplicates: "+list);
		
		ArrayList <String> noDupliList=new ArrayList<>();
		for (String word:list) {
			if(!noDupliList.contains(word)) {
				noDupliList.add(word);
			}
		}
		System.out.println("ArrayList without duplicates: "+noDupliList);
		
		
		
	}

}
