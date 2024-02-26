package org.task18assessment.java;

import java.util.Comparator;

import org.task1assessment.java.*;


public class RatingComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		if (e1.rating>=e2.rating) {
			return 1;
		}
		else if(e1.rating<=e2.rating) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
