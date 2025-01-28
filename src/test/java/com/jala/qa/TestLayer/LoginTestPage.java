package com.jala.qa.TestLayer;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.pageLayer.LoginPage;
import com.jala.qa.parentLayer.TestBase;

public class LoginTestPage extends TestBase{
	LoginPage login;
	LoginTestPage loginTest;
	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intilization();
		login = new LoginPage();
		
	}
	
	
	@Test(priority = 2, enabled = true)
	public void validateLoginpage() throws IOException, InterruptedException {
		
		String getMailtext = login.getEmail();
		System.out.println(getMailtext);
		String[] obj = getMailtext.split(":");
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		String obj1 = obj[1].trim();
		System.out.println(obj1);
		
	
		login.enterUsername(obj1);
		login.enterPassword(prop.getProperty("passWord"));
		login.clickOnLoginBtn();
		
	Thread.sleep(3000);
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, "https://magnus.jalatechnologies.com/Home/Index");
		Reporter.log("Home Page url matched successfully...",true);
		
	}
	
	
//	@Test(priority = 1)
//	public String getActualEmail() {
//		String getMailtext = login.getEmail();
//		System.out.println(getMailtext);
//		String[] obj = getMailtext.split(":");
//		System.out.println(obj[0]);
//		System.out.println(obj[1]);
//		String obj1 = obj[1].trim();
//		System.out.println(obj1);
//		
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	
}
