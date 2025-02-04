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

	@FindBy(id = "UserName")
	WebElement username;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath = "//h5[contains (text(),' Email ')]")
	WebElement email;
	
	@FindBy(xpath = "//h5[contains (text(),' Password ')]")
	WebElement pass;
	
	@FindBy(xpath = "//div/h5/following-sibling::h5")
	WebElement passText;
	
	public LoginPage() throws IOException {
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}

public String getEmail() {
	String emailText = email.getText();
	return emailText;
}

	
}
