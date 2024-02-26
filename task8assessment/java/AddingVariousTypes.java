package org.task8assessment.java;


// Using TreeSet, make sure to add varied data types to the set including Upper and Lower case and predict your output.
import java.util.TreeSet;

public class AddingVariousTypes {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("virat");
		set.add("Virat");//TreeSet is case sensitive
		set.add("rohit");
		set.add("virat");//in TreeSet duplicates are not allowed
		//set.add(18);
		//if you trying to insert another type of data type object it gives  java.lang.ClassCastException:
		System.out.println(set);
		
	}

}
