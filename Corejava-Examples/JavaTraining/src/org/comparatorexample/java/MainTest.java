package org.comparatorexample.java;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {

	public static void main(String[] args) {
		ArrayList <StudentOne> list=new ArrayList<>();
		list.add(new StudentOne(100,"ram gopal varma",56));
		list.add(new StudentOne(103,"karan johar",50));
		list.add(new StudentOne(101,"mahesh butt",65));
		Collections.sort(list,new NameComparator());
		for (StudentOne i: list) {
			System.out.println(i.id+" "+i.name+" "+i.age);
		}
		
	}

}
