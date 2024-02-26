package org.task15assessment.java;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



public class TestMain {

	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(100,"virat",45000);
		Employee emp2=new Employee(101,"rohit",45000);
		List <Employee> ls=new ArrayList<>();
		ls.add(emp);
		ls.add(emp2);
		File f = new File("D:\\readOnlyFile.txt");
		PrintWriter pw =new PrintWriter(f);
		pw.print(ls);
		pw.close();
		System.out.println("This file is Read only file "+f.setReadOnly());
		
	}
	
}
