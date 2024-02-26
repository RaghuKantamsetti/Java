package org.fileio.java;

import java.io.*;

public class BufferedWriterOne {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Sample1","Test2");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello World");
		bw.newLine();
		bw.write("Java is Easy");
		bw.newLine();
		bw.write(65);
		bw.flush();
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
	}

}
