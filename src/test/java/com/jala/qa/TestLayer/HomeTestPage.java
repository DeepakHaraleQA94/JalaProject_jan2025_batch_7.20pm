package com.jala.qa.TestLayer;

import java.io.IOException;

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
	public void setUp() throws IOException {
		intilization();
		LoginPage lagin1 = new LoginPage();
		lagin1.enterUsername(prop.getProperty("userName"));
		lagin1.enterPassword(prop.getProperty("passWord"));
		lagin1.clickOnLoginBtn();
		 home = new HomePage();
	}
	
	@Test
	public void validateHomePage() {
		home.clickOnCreateTab();
	}

}
