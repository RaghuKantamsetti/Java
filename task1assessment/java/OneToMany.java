package org.task1assessment.java;

public class OneToMany {

	public static void main(String[] args) {
		Company com=new Company("Techouts","Hyd");
		Employee emp1=new Employee(100,"virat",5,2008);
		Employee emp2=new Employee(101,"rohit",4.9f,2007);
		Employee emp3=new Employee(102,"pant",4.3f,2018);
		System.out.println("these two employees are worked in the same company ");
		System.out.println(com.name+" "+com.address+" "+emp1.empName+" "+emp1.id+" "+emp1.rating+" "+emp1.startYear);
		System.out.println(com.name+" "+com.address+" "+emp2.empName+" "+emp2.id+" "+emp2.rating+" "+emp2.startYear);

	}

}
