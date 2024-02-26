package org.collectionstasks.java;
import java.util.*;
/*Ques 3. WAP to map multiple countries with their respective capitals using map .Iterating them using
1.foreach loop
2.keyset iterator
3.entryset iterator along with foreach
4.EntrySet along with Java iterator*/


public class CountryCapital {

	public static void main(String[] args) {
		HashMap<String,String> data=new HashMap<>();
		data.put("India","Delhi");
		data.put("japan","tokyo");
		data.put("USA", "WashigtonDC");
		System.out.println("print using foreach loop........");
		for (String i:data.keySet()) {
			System.out.println(i+" "+data.get(i));	
		}
		System.out.println("print using entryset iterator........");
		for (Map.Entry m:data.entrySet()) {
			System.out.println(m.getKey()+"----->"+m.getValue());
		}
		System.out.println("print using entryset  using java iterator........");
		Iterator itr=data.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
