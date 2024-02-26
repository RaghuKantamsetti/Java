package org.fileio.java;

import java.io.*;

public class ExampleFour {

	public static void main(String[] args) throws IOException {
		FileInputStream fout=new FileInputStream("D:\\FilesIOSample\\test.txt");
		BufferedInputStream bout=new BufferedInputStream(fout);
		int i=0;
		while ((i=bout.read())!=-1) {
			System.out.print((char)i);
			
		}
		bout.close();
         
    	

	}

}
