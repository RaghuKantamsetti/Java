package org.fileio.java;

import java.io.*;


public class ExampleOne {

	public static void main(String[] args) throws IOException {
		FileOutputStream newFile=new FileOutputStream("D:\\FilesIOSample\\test.txt");
		String str="Hello World Welcome to Java King virat";
		byte[] strByte=str.getBytes();
		newFile.write(strByte);
		newFile.flush();
        System.out.println("success...");    
		newFile.close();
	}

}
