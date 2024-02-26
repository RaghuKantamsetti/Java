package org.task19.java;

import java.util.*;
import java.util.Scanner;

public class SampleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> arrList=new ArrayList<>();
		System.out.println("Enter no of Integers: ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			arrList.add(sc.nextInt());
		}
		System.out.println("this is duplicate values contain list: "+arrList);
		
		TreeSet <Integer> hashList=new TreeSet<>();
		hashList.addAll(arrList);
		
		System.out.println("After removing duplicates: "+hashList);
		
		Iterator <Integer> i=hashList.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
		
		
		
	}

}
