package org.fileio.java;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Sample1\\abc.txt");
		Scanner fileData=new Scanner(f);
		while(fileData.hasNextLine()) {
			String s=fileData.nextLine();
			System.out.println(s);
		}
	}

}
