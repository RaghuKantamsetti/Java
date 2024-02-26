package org.fileio.java;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		StudentTwo st=new StudentTwo(100,"virat",33);
		File f=new File("Virat");
		f.mkdir();
		File file =new File("D:\\Virat","records");
		file.createNewFile();
		FileWriter fw= new FileWriter(file,true);
		fw.write(65);
		
		/* File f1 = new File("D:\\Sample1");
		 f1.mkdir();
		 File f = new File("D:\\Sample1" ,"abc.txt");
		 f.createNewFile();
	        System.out.println(f.exists());
	        FileWriter fw = new FileWriter(f, true);
	        System.out.println(f.exists());
	        fw.write(97);
	        fw.write("Hai\nHow are you\n");
	        char[] ch1 =
	        { 'a', 'b', 'c' };
	        fw.write(ch1);
	        fw.flush();
	        fw.close();*/
		
		FileReader fr=new FileReader(file);
		char[] ch2 = new char[(int) (file.length())];
		fr.read(ch2);
		for (char ch1 : ch2)
        {
            System.out.print(ch1);
        }
		fw.flush();
		fw.close();
		fr.close();
	}

}
