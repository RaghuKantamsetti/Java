package org.fileio.java;

import java.io.*;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		//File f=new File()
		FileWriter fw=new FileWriter("D:\\Sample1\\top.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(65);
		pw.println(100);
		pw.println("Hello World");
		pw.println('c');
		pw.println(true);
		pw.flush();
		pw.close();
		//To delete file 
		File f=new File("D:\\Sample1\\Test2");
		if(f.delete()) 
			System.out.println("Deleted file is: "+f.getName());
		
		else
			System.out.println("file not deleted");

	}

}
