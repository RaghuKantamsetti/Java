package org.task26assessment.java;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		int arr[]= {5,2,7,8,9,10,1,0};
		System.out.println("Printing array without sorting:............ ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println('\n'+"Printing array after sorting:............... ");
		Arrays.parallelSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int arr1[]= {5,2,7,8,9,10,1,0};
		System.out.println('\n'+"Printing array after sorting with passing start ang end points:........... ");
		Arrays.parallelSort(arr1,0,4);
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}

}
