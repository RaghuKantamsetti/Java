package org.aggregation.java;

class Address{
	String street,city,country;
	Address(String street,String city,String country){
		this.street=street;
		this.city=city;
		this.country=country;
	}
}
class Employee{
	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;	
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.street+" "+address.city+" "+address.country);
	}
}
public class AggregationExample {

	public static void main(String[] args) {
		Address ad1=new Address("market street","tholeru","India");
		Address ad2=new Address("vinayaka temple street","Tholeru","India");
		Employee emp1=new Employee(100,"raghu",ad1);
		Employee emp2=new Employee(101,"pavan",ad2);
		emp1.display();
		emp2.display();
		
	}

}
