package org.collectionsexamples.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Rohit");
		hm.put(102, "klRahul");
		hm.putIfAbsent(104, "pant");
		hm.put(100, "virat");
		hm.put(105,"kohli");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.replace(105, "jadeja");
		HashMap <Integer,String> map=new HashMap<>();
		
		map.put(99, "dhoni");
		map.putAll(hm);
		System.out.println("...........,,,,,,,,,,,");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
