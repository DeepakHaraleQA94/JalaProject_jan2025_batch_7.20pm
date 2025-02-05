package com.jala.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.jala.qa.pageLayer.LoginPage;
import com.jala.qa.parentLayer.TestBase;

import net.bytebuddy.utility.RandomString;

public class Utility extends TestBase {
	String excelpath1 ="‪C:\\Users\\Sarvadnya\\OneDrive\\Desktop\\SignUp.xlsx";
	String excelPath ="C:\\Users\\Sarvadnya\\eclipse-workspace\\HybrideFramework_Jan2025\\JalaProject_jan2025_batch_7.20pm\\src\\main\\java\\com\\jala\\qa\\enviromentLayer\\login.xlsx";
	public Utility() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	************************************** login credential ***************************
	
	public void loginCredential() throws IOException {
	LoginPage login = new LoginPage();
	
	login.enterUsername(prop.getProperty("userName"));
	login.enterPassword(prop.getProperty("passWord"));
	login.clickOnLoginBtn();
	
	}

//	************************************** Data provide for fetch data from excel sheet ***************************
	
@DataProvider(name = "fetchData")
	public Object[][] getData( String sheetNumber) throws IOException {
		
		
		FileInputStream path = new FileInputStream(excelPath);
		XSSFWorkbook book = new XSSFWorkbook(path);
		XSSFSheet sheetname = book.getSheet(sheetNumber);
		
		Object data[][]= new  Object[sheetname.getLastRowNum()][sheetname.getRow(0).getLastCellNum()];
		
		for(int i=1; i<sheetname.getLastRowNum();i++) {
			for(int c=0;c<sheetname.getRow(0).getLastCellNum();c++) {
				System.out.println( sheetname.getRow(i).getCell(c).toString());
				 data[i][c] = sheetname.getRow(i).getCell(c).toString();
			}
			
		}
		
		return data;
	}
	
	
//*************************** extent report ****************************************



public static ExtentReports getExtentReport() {
	
	ExtentReports report = new ExtentReports();
	
	File extentReportFile = new File(System.getProperty("user.dir")+"\\ExtentReports\\eReport.html");
	
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
	
	report.attachReporter(sparkReporter);
	
	return report;
	
}

//***************************************** screnshot ******************************


public void screenshot(String MethodName) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(src);
	 String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
	 String random = RandomString.make(2);		 
//	 File des1 = new File( System.getProperty("user.dir")+ "\\screenshot\\"+random+".png"); 
	 File des = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\HybrideFramework_Jan2025\\JalaProject_jan2025_batch_7.20pm\\screnshot1\\"+MethodName+timestamp+".png");
	 FileHandler.copy(src, des);

		
}


}
