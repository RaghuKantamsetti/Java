package org.task26assessment.java;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String[] s=new String[10];
		s[1]="Virat";
		s[4]="java";
		System.out.println(s[1]);
		Optional<String> nullCheck=Optional.ofNullable(s[4]);
		if (nullCheck.isPresent()) {
			String upperCase=s[4].toUpperCase();
			System.out.println(upperCase);
			System.out.println(nullCheck.get());
		}
		else {
			System.out.println("String is empty");
		}
	}

}
