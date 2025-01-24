package com.jala.qa.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.parentLayer.TestBase;

public class LoginPage extends TestBase {

	//loginpage = sahil 
	//homePage = geetha
	//createemployee page = siva
	// srearch page = shubham
	@FindBy(id ="UserName")
	WebElement username;
	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
		}
	
	public void enterUsername() {
		username.sendKeys("xyz");
	}
	}
