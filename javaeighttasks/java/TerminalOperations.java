package org.javaeighttasks.java;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(100,"virat",50000));
		list.add(new Employee(101,"pant",30000));
		list.add(new Employee(102,"rohit",45000));
		list.add(new Employee(103,"jaddu",35000));
		list.add(new Employee(104,"bumrah",40000));
		
		//collect operation
		List<Employee> newSet=list.stream().filter(p->p.salary>=40000).collect(Collectors.toList());
		System.out.println("Collect method is used:........");
		newSet.forEach(y->System.out.println(y.id+" "+y.name+" "+y.salary));
		
		System.out.println("Reduce method is used to calculate the sum of salaries:.........");
		float  sumOfSalaries=list.stream().filter(p->p.salary>=40000).map(p->p.salary).reduce( 0.0f,(sum,p)->sum+p);
		System.out.println("total salary: "+sumOfSalaries);
		
		
		System.out.println("Anymatch method is used:........");
		boolean ans=list.stream().anyMatch(p->p.name.startsWith("v")&&p.salary>45000);
		System.out.println(ans);
		
		System.out.println("noneMatch method is used:........");
		boolean ans1=list.stream().noneMatch(p->p.name.startsWith("v")&&p.salary>45000);
		System.out.println(ans1);
		
		System.out.println("allMatch method is used:........");
		boolean ans2=list.stream().allMatch(p->p.salary>=30000);
		System.out.println(ans2);
		
		
		System.out.println("forEachOrdered method is used:........");
		newSet.parallelStream().forEach(y->System.out.println("This is using parallel Stream: "+y.id+" "+y.name+" "+y.salary));
		System.out.println(".............................................................");
		newSet.parallelStream().forEachOrdered(y->System.out.println
				("This is using parallel Stream forEachOrdered: "+y.id+" "+y.name+" "+y.salary));

	}

}
