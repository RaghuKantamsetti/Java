package org.task16assessment.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvToExcel {


	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\sampleCsv.CSV");
		/*PrintWriter pr= new PrintWriter("D:\\javaAssessment.XLS");
		Scanner sc= new Scanner(fr);
		while(sc.hasNext()) {
			pr.println(sc.next());
		}
		pr.close();*/
		
		XSSFWorkbook sample=new XSSFWorkbook();
		XSSFSheet ss=sample.createSheet("Cricket");
		Scanner sc= new Scanner(fr);
		int rowid=0;
		while(sc.hasNext()) {
			Row row=ss.createRow(rowid++);
			String[] s =sc.next().split(",");
			
			int cellid=0;
			for (String str:s) {
				Cell cell=row.createCell(cellid++);
				cell.setCellValue(str);
			}
		}
		FileOutputStream pw = new FileOutputStream(new File("D:\\CsvToExcel.xlsx"));
		sample.write(pw);
		pw.close();
	}

}

