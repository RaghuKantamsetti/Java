package org.collections20.java;

import java.util.*;
import java.util.Scanner;

public class StringToKeyValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		HashMap <String,String> map=new HashMap<>();

		String[] arr=s.split("-");
		for (String i:arr) {
			
			String[] str=i.split("[||]");
			/*for(String j:str) {
				System.out.println(j);*/
			
			String state=str[0].trim();
			
			String capital=str[2].trim();
			
			map.put(state,capital);
			
		}
		
		System.out.println(map);
	}

}
