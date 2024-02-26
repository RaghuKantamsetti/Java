package org.statickeyword.java;

class Counters{
	static int count=0;
	Counters(){
		count++;
		System.out.println(count);
	}
}

public class Staticvariable {

	public static void main(String[] args) {
		Counters s1=new Counters();
		Counters s2=new Counters();


	}

}// when you use static keyword for variable count its memory is static for every object
