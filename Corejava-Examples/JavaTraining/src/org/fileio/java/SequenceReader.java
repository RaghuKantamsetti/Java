package org.fileio.java;

import java.io.*;


public class SequenceReader {

	public static void main(String[] args) throws IOException{
		FileInputStream fin1 =new FileInputStream("D:\\FilesIOSample\\test.txt");
		FileInputStream fin2 =new FileInputStream("D:\\FilesIOSample\\test1.txt");
		FileOutputStream newfile= new FileOutputStream("D:\\FilesIOSample\\combined.txt");
		SequenceInputStream total=new SequenceInputStream(fin1,fin2);
		int k=0;
		while((k=total.read())!=-1) {
			newfile.write(k);
		}
		fin1.close();
		fin2.close();
		newfile.close();
	}

}
