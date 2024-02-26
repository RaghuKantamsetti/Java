package org.task26assessment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
public class CollectionClass {

	public static void main(String[] args) {
		Employee emp=new Employee(100,"virat",45000);
		Employee emp2=new Employee(101,"rohit",90000);
		List <Employee> ls=new ArrayList<>();
		ls.add(emp);
		ls.add(emp2);
		Double average = ls.stream()  
                .collect(Collectors.averagingDouble(p->p.sal));  
		System.out.println("avg of salaries:"+average);
		Double sum = ls.stream()  
                .collect(Collectors.summingDouble(p->p.sal));  
		System.out.println("sum of salaries:"+sum);
		Long noOfElements = ls.stream()  
                .collect(Collectors.counting());  
		System.out.println("avg of salaries:"+noOfElements);
	}

}
