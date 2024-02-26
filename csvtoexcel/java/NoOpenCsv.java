package org.csvtoexcel.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NoOpenCsv {

	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		PrintWriter pw= new PrintWriter("D:\\SmallData.CSV");
		System.out.println("Enter how many rows: ");
		int noOfRows=sc.nextInt();
		for (int i=0;i<noOfRows;i++) {
			pw.println(sc.next());
		}
		pw.close();
		
	}

}
