package org.csvtoexcel.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\sampleCsv.CSV");
		PrintWriter pr= new PrintWriter("D:\\test.XLS");
		Scanner sc= new Scanner(fr);
		while(sc.hasNext()) {
			pr.println(sc.next());
		}
		pr.close();
	}

}
