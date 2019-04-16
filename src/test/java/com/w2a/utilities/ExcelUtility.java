package com.w2a.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static XSSFSheet sheet;

	public static Object[][] testData(String xlPath, String sheetName) throws Exception {
		String[][] testdata = null;

		try {

			fis = new FileInputStream(xlPath);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetName);

			int startRow = 1;
			int startCol = 1;

			int totalRows = sheet.getLastRowNum();
			int totalCols = sheet.getRow(0).getLastCellNum();

			testdata = new String[totalRows][totalRows];
			int ci = 0;

			for (int i = startRow; i <= totalRows; i++, ci++) {
				int cj = 0;
				for (int j = startCol; j <= totalCols; j++, cj++) {
					testdata[ci][cj] = getCellData(i, j);
					System.out.println(testdata[ci][cj]);
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Excelfile is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the Excelfile");
			e.printStackTrace();
		}
		return (testdata);
	}

	public static String getCellData(int rowNum, int colNum) throws Exception {
		String cellData ="";
		try {
			cell = sheet.getRow(rowNum).getCell(colNum);

			if (cell.getCellType() == CellType.STRING) {
				 cellData = cell.getStringCellValue();

			} else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.NUMERIC) {
				 cellData = String.valueOf(cell.getNumericCellValue());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return cellData;
		
	}

}
