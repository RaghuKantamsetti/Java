package org.task2assessment.java;

public class ManyToMany {

	public static void main(String[] args) {
		Teachers t1=new Teachers("sachin","phy");
		Teachers t2=new Teachers("dhoni","chem");
		Students s1=new Students(1,"virat",98);
		Students s2=new Students(2,"rohit",99);
		System.out.println("many to many relations");
		System.out.println(s1.name+" has two teachers "+t1.teachName+", "+t2.teachName);
		System.out.println(t1.teachName+" has two students "+s1.name+", "+s2.name);
	}

}
