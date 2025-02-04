package com.jala.qa.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {

	
	@Test
	public void getData() throws IOException {
		
		String excelpath1 ="‪C:\\Users\\Sarvadnya\\OneDrive\\Desktop\\SignUp.xlsx";
		FileInputStream path = new FileInputStream(excelpath1);
		XSSFWorkbook book = new XSSFWorkbook(path);
		XSSFSheet sheetname = book.getSheet("Sheet4");
		
		Object data[][]= new  Object[sheetname.getLastRowNum()][sheetname.getRow(0).getLastCellNum()];
		
		for(int i=1; i<sheetname.getLastRowNum();i++) {
			for(int c=0;c<sheetname.getRow(1).getLastCellNum();c++) {
				System.out.println( sheetname.getRow(i).getCell(c).toString());
			}
		}
	}
}
