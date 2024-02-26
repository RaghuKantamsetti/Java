package org.test2.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SaveTheData {
	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet ss=book.createSheet(" Badminton slots Data ");
	XSSFSheet ss1=book.createSheet(" Football slots Data ");
	XSSFSheet ss2=book.createSheet(" BoxCricket slots Data ");
	
	public void badSave() throws IOException {
		int rowid=0;
		for (Integer i:BadmintonSlots.badmintonfilledSlots.keySet()) {
			Row row=ss.createRow(rowid++);
			String str =(Integer.toString(i))+" "+ BadmintonSlots.badmintonfilledSlots.get(i);
			StringTokenizer st = new StringTokenizer(str," ");  
			int cellid=0;
			while (st.hasMoreTokens()) {
				Cell cell=row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream pw = new FileOutputStream(new File("D:\\FirstExcel.xlsx"));
		book.write(pw);
		pw.close();
		
	}
	public void footSave() throws IOException {
		int rowid=0;
		for (Integer i:FootballSlots.footballFilledSlots.keySet()) {
			Row row=ss1.createRow(rowid++);
			String str =(Integer.toString(i))+" "+ FootballSlots.footballFilledSlots.get(i);
			StringTokenizer st = new StringTokenizer(str," ");  
			int cellid=0;
			while (st.hasMoreTokens()) {
				Cell cell=row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream pw = new FileOutputStream(new File("D:\\FirstExcel.xlsx"));
		book.write(pw);
		pw.close();
	}
	public void cricketSave() throws IOException {
		int rowid=0;
		for (Integer i:BoxCricketSlots.cricketFilledSlots.keySet()) {
			Row row=ss2.createRow(rowid++);
			String str =(Integer.toString(i))+" "+ BoxCricketSlots.cricketFilledSlots.get(i);
			StringTokenizer st = new StringTokenizer(str," ");  
			int cellid=0;
			while (st.hasMoreTokens()) {
				Cell cell=row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream pw = new FileOutputStream(new File("D:\\FirstExcel.xlsx"));
		book.write(pw);
		pw.close();
	}

}
