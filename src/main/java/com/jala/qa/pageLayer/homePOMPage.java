package com.jala.qa.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.parentLayer.TestBase;

public class homePOMPage extends TestBase{

	@FindBy (linkText = "Employee")
	WebElement employeeTab;
	
	@FindBy(linkText = "Create")
	WebElement createTab;
	
	public homePOMPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncreateTab() {
		employeeTab.click();
		createTab.click();
	}

}
