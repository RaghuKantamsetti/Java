package org.collectionsexamples.java;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExamples {

	public static void main(String[] args) {
		ArrayList <Students> ob=new ArrayList<>();
		ob.add(new Students(101,"virat",34));
		ob.add(new Students(100,"rohit",35));
		ob.add(new Students(111,"pant",25));
	
		Collections.sort(ob);
		for(Students i:ob) {
			System.out.println(i.id+" "+i.name+" "+i.age);
		}


		
	}

}
