package org.csvtoexcel.java;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadUsingScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner reader =new Scanner(new File("D:\\opencsvSmaple.CSV"));
		//reader.useDelimiter(",");
		while (reader.hasNext()) {
			System.out.println(reader.next());
			
		}
		reader.close();
	}

}
