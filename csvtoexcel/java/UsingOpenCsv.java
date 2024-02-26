package org.csvtoexcel.java;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class UsingOpenCsv {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\opencsvSmaple.CSV");
		FileWriter pw=new FileWriter(f);
		CSVWriter csvw=new CSVWriter(pw);
		String[] str1= {"name","Centuries","age"};
		csvw.writeNext(str1);
		String[] str= {"virat","70","33"};
		csvw.writeNext(str);
		csvw.flush();
		csvw.close();
}

}
