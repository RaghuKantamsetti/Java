package org.task4assessment.java;
class Employee{
	String name;
	String id;
	Employee(String name,String id){
		this.name=name;
		this.id=id;
	}
	public boolean equals(Employee obj) {
		try {
			String name=this.name;
			String id=this.id;
			//Employee e=Employee(obj);
			String name1=obj.name;
			String id1=obj.id;
			if (name.equals(name1)&&id.equals(id1)) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(ClassCastException|NullPointerException e) {
			return false;
		}

	}

}

public class EqualsMethod {

	public static void main(String[] args) {
		Employee e1=new Employee("durga","101");
		Employee e2=new Employee("ashok","200");
		Employee e3=new Employee("ashok","200");
		System.out.println(e1.equals(e2)); //false
		System.out.println(e2.equals(e3)); // true
	}

}