package org.collectionstasks.java;
import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("virat");
		list.add("rohit");
		list.add("pant");
		list.add("iyer");
		list.add("jaddu");
		//using listIterator we can reverse the Arraylist
		System.out.println("with normal order:......."+list);
		ListIterator<String> itr=list.listIterator(list.size());
		while(itr.hasPrevious()) {
			String str=itr.previous();
			System.out.println(str);
		}
	}

}
