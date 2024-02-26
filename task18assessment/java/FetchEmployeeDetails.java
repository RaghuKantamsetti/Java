package org.task18assessment.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.task1assessment.java.*;

public class FetchEmployeeDetails {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee emp1=new Employee(100,"virat",5,2008);
		Employee emp2=new Employee(101,"rohit",4.9f,2007);
		Employee emp3=new Employee(102,"pant",4.3f,2018);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list,new StartYearComparator());
		Collections.sort(list,new RatingComparator());
		
		for (Employee s:list) {
			System.out.println(s.id+" "+s.empName+" "+s.rating+" "+s.startYear);
		}
	}

}
