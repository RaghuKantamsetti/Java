package org.task14assessment.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) throws IOException {
		Manager emp=new Manager(100,"virat",45000);
		Manager emp2=new Manager(101,"rohit",45000);
		List <Employee> ls=new ArrayList<>();
		ls.add(emp);
		ls.add(emp2);
		//emp.create();
		//emp.write(ls);
		//emp.read();
		emp.create();
		emp.write(ls);
		emp.read();
		
	}

}
