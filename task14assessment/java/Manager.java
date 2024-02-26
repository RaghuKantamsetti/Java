package org.task14assessment.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Manager extends Employee{
	
	Manager(int id, String name, float sal) {
		super(id, name, sal);
	}
	public void create() {
		File f =new File("D:\\thisIsManager.txt");
		System.out.println("File created on manager take control class: "+f.exists());
	}
	public void write(List obj) throws IOException {
		PrintWriter pw =new PrintWriter("D:\\thisIsManager.txt");
		pw.print(obj);
		pw.close();
	}
	public void read() throws IOException {
		FileReader fr =new FileReader("D:\\thisIsManager.txt");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}
