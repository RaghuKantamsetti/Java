package org.collectionstasks.java;
import java.util.*;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet <Integer> set=new HashSet<>();
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		System.out.println("this is hashset:...... "+set);
		Object arr[]=set.toArray();
		System.out.println("this is array:........ ");
		for (Object i:arr) {
			System.out.println(i);
		}
		
	}

}
