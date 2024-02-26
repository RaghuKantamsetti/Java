package org.stringcase.java;
import java.util.*;


public class ChangingStrings {
	
	Scanner sc=new Scanner(System.in);
	
	ArrayList <String> arr=new ArrayList<>();
	public void method(int n) {
		
			for (int i=0;i<n;i++) {
				arr.add(sc.nextLine());
			}
			Collections.sort(arr);
			System.out.println("..........");
			System.out.println(arr);
			//int mid=(n/2)+(n%2);
			int m=n/2;
			if(n%2!=0) {
				m+=1;
				for (int i=0;i<m;i++) {
					arr.set(i,arr.get(i).toUpperCase());
				}
				for (int j=m;j<arr.size();j++) {
					arr.set(j,arr.get(j).toLowerCase());
				}
			}
			else {
				for (int i=0;i<m;i++) {
					arr.set(i,arr.get(i).toUpperCase());
				}
				for (int j=m;j<arr.size();j++) {
					arr.set(j,arr.get(j).toLowerCase());
			}
			}
		        
			System.out.println(arr);
	}	
}
