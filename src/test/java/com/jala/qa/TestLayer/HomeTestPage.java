package com.jala.qa.TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.pageLayer.HomePage;
import com.jala.qa.pageLayer.LoginPage;
import com.jala.qa.parentLayer.TestBase;

public class HomeTestPage  extends TestBase{
	HomePage home;
	public HomeTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		intilization();
		LoginPage lagin1 = new LoginPage();
		lagin1.enterUsername(prop.getProperty("userName"));
		lagin1.enterPassword(prop.getProperty("passWord"));
		lagin1.clickOnLoginBtn();
		Thread.sleep(3000);
		
		home = new HomePage();
	}
	
	@Test
	public void validateHomePage() throws IOException {

 	 String actual = home.validateHomeText();
 	 
 	 Assert.assertEquals(actual, "Welcome to JALA Academy");
 	 Reporter.log("text matched of home page", true);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
