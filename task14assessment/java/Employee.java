package org.task14assessment.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Employee {
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void create() {
		File f =new File("D:\\taskAssess.txt");
		System.out.println("File created on employee class: "+f.exists());
	}
	public void write(Object obj) throws IOException {
		PrintWriter pw =new PrintWriter("D:\\taskAssess.txt");
		pw.print(obj);
		pw.close();
	}
	public void read() throws IOException {
		FileReader fr =new FileReader("D:\\taskAssess.txt");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()) {
		
			System.out.println(sc.next());
		}
	}
	
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ",salary=" + sal;
	}
}
