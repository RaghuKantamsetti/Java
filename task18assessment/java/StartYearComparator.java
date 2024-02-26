package org.task18assessment.java;

import java.util.Comparator;

import org.task1assessment.java.*;

public class StartYearComparator implements Comparator<Employee> {
	public  int compare(Employee e1,Employee e2) {
		if(e1.startYear>=e2.startYear) {
			return 1;
		}
		else if (e1.startYear<=e2.startYear) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
