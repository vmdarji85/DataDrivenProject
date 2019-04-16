package com.w2a.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ExcelFileReading {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File excel = new File("C:\\Users\\vivek\\Desktop\\newFile1.xlsx");
		
		FileInputStream fis = new FileInputStream(excel);
		
		//XSSFWorkbook wb = (XSSFWorkbook) XSSFWorkbookFactory.create(fis);
		Workbook wb= WorkbookFactory.create(fis);
		
		//getting sheet using index
		
		Sheet sheet0 = wb.getSheetAt(0);
		
		//get row
		Row row0 = sheet0.getRow(0);
		
		//get column
		
		Cell cell1 = row0.getCell(0);
		Cell cell2 = row0.getCell(1);
		Cell cell3 = row0.getCell(2);
		
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		
		int i = 45;
		
		
		
		
	}
	
	

	
	

}
