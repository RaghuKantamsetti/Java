package org.optionalclass.java;

import java.util.Optional;

public class ExampleOne {

	public static void main(String[] args) {
		String[] s=new String[10];
		s[4]="Virat is king";
		Optional<String> nullCheck=Optional.ofNullable(s[4]);
		if (nullCheck.isPresent()) {
			String upperCase=s[4].toUpperCase();
			System.out.println(upperCase);
		}
		else {
			System.out.println("String is empty");
		}
		
	}

}
