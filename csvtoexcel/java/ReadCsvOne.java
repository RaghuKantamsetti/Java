package org.csvtoexcel.java;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCsvOne {

	public static void main(String[] args) throws CsvValidationException {
		try {
			CSVReader csvReader = new CSVReader(new FileReader("D:\\opencsvSmaple.CSV"));
			String[] nextString;
			while((nextString=csvReader.readNext())!=null) {
				for(String str:nextString) {
					System.out.println(str+'\t');
				}
				System.out.println();
			}
			csvReader.close();

		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}