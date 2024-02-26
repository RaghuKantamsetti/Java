package org.results.java;

import java.util.HashMap;
import java.util.Scanner;

/*problem statement 16.
Input:HashMap
{selva:75.6f, abi:89.5f,ram:40}
Output:hashmap
{selva:pass,abi:pass,ram:fail}
If the mark is >60 return the names and their status as pass in a output hashmap else fail*/

public class Results {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,Float> results=new HashMap<>();
		System.out.println("Enter no of Students: ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			passOrFail re=new passOrFail(sc.next(),sc.nextFloat());
			//passOrFail re1=new passOrFail(sc.next(),sc.nextFloat());
			//passOrFail re2=new passOrFail(sc.next(),sc.nextFloat());
			
			results.put(re.name,re.marks);
			//results.put(re1.name,re1.marks);
			//results.put(re2.name,re2.marks);
		}
		
		
		
		HashMap<String,String> mainResult=new HashMap<>();

		
		for (String i: results.keySet()) {
			if (results.get(i)>60) 
				mainResult.put(i, "pass");
			else
				mainResult.put(i, "fail");
			
		}
		System.out.println(mainResult);
		sc.close();
	}

}
