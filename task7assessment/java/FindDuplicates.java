package org.task7assessment.java;

import java.util.HashMap;

// In an array of 1-10, multiple numbers are duplicates, how do you find duplicates using Map implemented classes.

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,3,2,4,3,4,2,3,2,3,4,5,6,7,8};
		HashMap<Integer,Integer> map=new HashMap<>();
		for (Integer key:arr) {
			if (map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}

}
