package org.csvtoexcel.java;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class WriteDataUsingLoop {

	public static void main(String[] args) throws IOException, CsvValidationException {
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\opencsvSmaple.CSV");
		FileWriter pw=new FileWriter(f,true);
		CSVWriter csvw=new CSVWriter(pw);
		List list=new ArrayList();
		System.out.println("Enter how amny rows: ");
		int noOfRows=Integer.parseInt(sc.nextLine());
		for (int i=0;i<noOfRows;i++) {
			String s=sc.nextLine();
			String[] data=s.split(" ");
			list.add(data);
		}
		csvw.writeAll(list);
		csvw.close();
		System.out.println("done");
		

	}
}
