package org.csvtoexcel.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapToExcel {

	public static void main(String[] args) throws IOException{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet ss=book.createSheet(" Student Data ");
		Row row ;
		HashMap<String,Object[]> map= new HashMap<>();
		map.put("1", new Object[] {"Name","Centuries","Age"});
		map.put("2", new Object[] {"virat","70","32"});
		map.put("3", new Object[] {"rohit","40","33"});
		Set<String> keyid=map.keySet();
		int rowid=0;
		for(String key:keyid) {
			row=ss.createRow(rowid++);
			Object[] objArr=  map.get(key);
			int cellid=0;
			for (Object obj:objArr) {
				Cell cell=row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
			
		}
        FileOutputStream pw = new FileOutputStream(new File("D:\\FirstExcel.xlsx"));
		book.write(pw);
		pw.close();
		
	}

}
