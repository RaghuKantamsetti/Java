package org.fileio.java;

import java.io.*;

public class FileOne {

	public static void main(String[] args)  throws IOException{
		File f= new File("D:\\Tech");
		f.mkdir();
		File f1= new File("D:\\Tech","abc.txt");
		   System.out.println(f.exists());
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1,true);//it will  append this new data to file every time
		fw.write(65);
		fw.write(" I love java");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();
        fw.close();
	}

}
