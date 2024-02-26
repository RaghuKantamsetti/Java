package org.collectionsexamples.java;

public class Students implements Comparable<Students> {
	int id;
	String name;
	int age;
	Students(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Students s) {
		//return this.name.compareTo(s.name);
		if (id==s.id) {
			return 0;
		}
		else if (id>s.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
