package org.task26assessment.java;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner joinNames=new StringJoiner(" ");
		joinNames .add("virat");
		joinNames.add("is");
		joinNames.add("King");
		System.out.println("Normal String: .........");
		System.out.println(joinNames);
		StringJoiner joinNames1=new StringJoiner(" ");
		joinNames1 .add("virat");
		joinNames1.add("is");
		joinNames1.add("King");
		StringJoiner merge= joinNames.merge(joinNames1);
		System.out.println("Merged String: ..........");
		System.out.println(merge);
	}

}
