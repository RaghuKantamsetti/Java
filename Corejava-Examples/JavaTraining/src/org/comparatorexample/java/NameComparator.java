package org.comparatorexample.java;
 import java.util.*;
public class NameComparator implements Comparator<StudentOne>{
	public int compare(StudentOne s1 , StudentOne s2) {
		return s1.name.compareTo(s2.name);
	}

}
