package org.task17assessment.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExcelToCsv {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\CsvToExcel.xls");
		PrintWriter pw =new PrintWriter(new File("D:\\ExcelToCsv.CSV"));
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()) {
			pw.println(sc.next());
		}
		pw.close();
	}

}
