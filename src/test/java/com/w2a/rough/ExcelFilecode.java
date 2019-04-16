package com.w2a.rough;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFilecode {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//creating sheets in the excel file
		XSSFSheet PracticeSheet1 = wb.createSheet("first sheet");
		XSSFSheet PracticeSheet2 = wb.createSheet("second sheet");
		
		//create rows
		Row row0 = PracticeSheet1.createRow(0);
		Row row1 = PracticeSheet1.createRow(1);
		Row row2 = PracticeSheet1.createRow(2);
		
		//create column and add value
		Cell cellA = row0.createCell(0);
		cellA.setCellValue("Name");
		
		//create column and add value
		Cell cellB = row0.createCell(1);
		cellB.setCellValue("Email");
		
		//create column and add value
		Cell cellC = row0.createCell(2);
		cellC.setCellValue("Address");
		
		
		File f = new File("C:\\Users\\vivek\\Desktop\\newFile1.xlsx");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		
		fos.close();
		
		System.out.println("Excel File is written successfully");
		
		
		


	}

}
