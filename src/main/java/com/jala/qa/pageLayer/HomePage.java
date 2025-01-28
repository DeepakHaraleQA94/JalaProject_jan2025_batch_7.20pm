package com.jala.qa.pageLayer;

import java.awt.print.PageFormat;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.parentLayer.TestBase;

public class HomePage extends TestBase{

	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Employee")
	WebElement emplyeeTab;

	@FindBy(linkText = "Create")
	WebElement createTab;
	
	public void clickOnCreateTab() {
		emplyeeTab.click();
		createTab.click();
	}
	
	
}