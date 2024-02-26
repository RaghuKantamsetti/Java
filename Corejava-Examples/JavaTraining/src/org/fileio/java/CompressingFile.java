package org.fileio.java;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CompressingFile {

	public static void main(String[] args) throws IOException {
		String filePath="D:\\Sample1\\top.txt";
		String destPath="D:\\Sample1\\top.txt.gz";
		byte[] bytes=new byte[1024];
		int len;
		FileInputStream fin=new FileInputStream(filePath);
		FileOutputStream fout = new FileOutputStream(destPath);
		GZIPOutputStream zout =new GZIPOutputStream(fout);
		while ((len=fin.read(bytes))!= -1){
			zout.write(bytes,0,len);
		}
		zout.flush();
		zout.close();
		
	}

}
