package org.test3.java;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		 HashMap <Integer,String> mapBad=new HashMap<>();
		 HashMap <Integer,String> mapFoot=new HashMap<>();
		 HashMap <Integer,String> mapCri=new HashMap<>();
		 int count=8;
		 for (int i=1;i<=10;i++) {
			 mapBad.put(i, toString(count)+":00"+":"+toString(++count)+":00");
		 }
		 int count1=8;
		 for (int i=1;i<=20;i++) {
			 mapFoot.put(i, toString(count1)+":00"+":"+toString(count1)+":30");
			 mapFoot.put(++i, toString(count1)+":30"+":"+toString(++count1)+":00");
		 }
		 int count2=9;
		 for (int i=1;i<=5;i++) {
			 mapCri.put(i, toString(++count2)+":00"+":"+toString(++(count2)+1)+":00");
			 mapCri.put(++i, toString(++count2)+":00"+":"+toString(++(count2)+1)+":00");
		 }
		 
		 Iterator itr=mapBad.entrySet().iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 Iterator itr1=mapFoot.entrySet().iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
		 Iterator itr2=mapCri.entrySet().iterator();
		 while(itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
	}
	
	private static String toString(int i) {
		return i+"";
	}

}
