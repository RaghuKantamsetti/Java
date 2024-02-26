package org.fileio.java;

import java.io.*;

public class ExampleTwo {

	public static void main(String[] args) throws IOException {
		FileInputStream open=new FileInputStream("D:\\Raghu\\testout.txt");
		int i=0;
		 while((i=open.read())!=-1){   
			 System.out.print((char)i);
		 }
		 open.close();
	}

}
	