package org.task15assessment.java;

public class Employee {
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ",salary=" + sal;
	}

}
