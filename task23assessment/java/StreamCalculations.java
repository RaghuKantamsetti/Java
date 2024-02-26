package org.task23assessment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamCalculations {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i=1;i<=10;i++) {
			ls.add(i);
		}

		float sumOfList=ls.stream().map(x->x).reduce( (int) 0.0f,(sum,x)->sum+x);
		System.out.println(sumOfList);
		Double avgOfList=ls.stream().mapToDouble(x->x).average().orElse(0.0);
		System.out.println(avgOfList);
		Double minValue=ls.stream().mapToDouble(x->x).min().orElse(0.0);
		System.out.println(minValue);
		Double maxValue=ls.stream().mapToDouble(x->x).max().orElse(0.0);
		System.out.println(maxValue);
		long countnNO=ls.stream().mapToDouble(x->x).count();
		System.out.println(countnNO);
	}

}
