package org.fileio.java;
import java.io.*;

public class ExampleThree {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("D:\\FilesIOSample\\test.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String str="Hello World Welcome to Java King virat";
		byte[] strByte=str.getBytes();
		bout.write(strByte);
		bout.flush();
        System.out.println("success...");    
        bout.close();	}

}
