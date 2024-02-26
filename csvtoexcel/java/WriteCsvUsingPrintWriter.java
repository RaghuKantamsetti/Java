package org.csvtoexcel.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCsvUsingPrintWriter {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter("D:\\sampleCsv.CSV");
		for (int i=1;i<5;i++) {
			pw.println(sc.next());
		}
		pw.flush();
		pw.close();
	}

}
