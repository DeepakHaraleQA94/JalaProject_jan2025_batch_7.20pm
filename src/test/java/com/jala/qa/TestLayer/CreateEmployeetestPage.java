package com.jala.qa.TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jala.qa.Utility.Utility;
import com.jala.qa.pageLayer.CreateEmployeePage;
import com.jala.qa.pageLayer.HomePage;
import com.jala.qa.pageLayer.homePOMPage;
import com.jala.qa.parentLayer.TestBase;

public class CreateEmployeetestPage  extends TestBase{
	CreateEmployeePage emp;
	public CreateEmployeetestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
@BeforeMethod()
	public void setUp() throws IOException {
		intilization();
		Utility util = new Utility();
		util.loginCredential();
		homePOMPage home = new homePOMPage();
		home.clickOncreateTab();
		 emp = new CreateEmployeePage();
	}

//@DataProvider
//public static Object[][] test() {
//	Object name[][] = {{"dipak1","xyz1","hyderabad"},
//					{"hello1","pqr1","delhi"}};
//	return name;
//	
//}


@DataProvider
public static Object[][] test1() throws IOException {
	Utility util = new Utility();
	Object name[][] = util.getData("Sheet3");
	return name;
	
}


//@Test(dataProvider = "fetchData", enabled = true, dataProviderClass = Utility.class)
@Test(dataProvider = "test1")
public void validateCreateEmployeePage(String fname, String lname,String mail, String moNo, String DOB,String address) throws InterruptedException {
	emp.enterfirstName(fname);
	emp.entersecondName(lname);
	emp.enteremailId(mail);
	emp.entermobileNumber(moNo);
	emp.enterdateOfBirth(DOB);
	emp.entermalebtn();
	emp.enteraddress(address);
	emp.entercountry();
	emp.enterCity();
	emp.selectSkils();
	emp.clickOnSaveBtn();	
	
	Thread.sleep(3000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://magnus.jalatechnologies.com/Employee/Search");
Reporter.log("search page url matched",true);
}


@AfterMethod(enabled = true)
public void tearDown() {
	
	driver.close();
	driver.quit();
}
	
}
