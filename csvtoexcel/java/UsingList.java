package org.csvtoexcel.java;

import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

public class UsingList {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\opencsvSmaple.CSV");
		FileWriter pw=new FileWriter(f,true);
		CSVWriter csvw=new CSVWriter(pw);
		List list=new ArrayList();
		String[] str1= {"rohit","35","34"};
		String[] str= {"sachin","101","45"};
		list.add(str1);
		list.add(str);	
		csvw.writeAll(list);
		csvw.flush();
		csvw.close();
	}

}
