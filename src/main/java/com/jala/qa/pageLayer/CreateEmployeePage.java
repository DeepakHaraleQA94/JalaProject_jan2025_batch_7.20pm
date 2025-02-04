package com.jala.qa.pageLayer;

import java.awt.print.PageFormat;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jala.qa.parentLayer.TestBase;

public class CreateEmployeePage extends TestBase {

	public CreateEmployeePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="EmailId")
	WebElement emailId;
	
	@FindBy(id="MobileNo")
	WebElement mobileNumber;
	
	@FindBy(id="DOB")
	WebElement dateOfBirth;
	
	@FindBy(id="rdbMale")
	WebElement malebtn;
	
	@FindBy(id="rdbFemale")
	WebElement femalebtn;
	
	
	@FindBy(id="Address")
	WebElement address;
	
	
	@FindBy(id="CountryId")
	WebElement country;
	
	@FindBy(id="CityId")
	WebElement City;
	
	@FindBy(id="chkOtherCity")
	WebElement othercity;
	
	@FindBy(id="chkSkill_6")
	WebElement skill;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveBtn;
	

	
	public void enterfirstName(String fName) {
		firstName.sendKeys(fName);	
	}
	
	public void entersecondName(String sName) {
		lastName.sendKeys(sName);	
	}
	
	public void enteremailId(String email) {
		emailId.sendKeys(email);	
	}
	
	public void entermobileNumber(String mobileNo) {
		mobileNumber.sendKeys(mobileNo);
	}
	
	public void enterdateOfBirth(String DateOfBirth ) {
		dateOfBirth.sendKeys(DateOfBirth);
	}
	
	public void entermalebtn() {
		malebtn.click();
	}
	
	public void enterfemalebtn() {
		femalebtn.click();
	}
	
	public void enteraddress(String Address) {
		address.sendKeys(Address);
	}
	
	public void entercountry() {
		Select select = new Select(country);
		select.selectByIndex(5);
	}
	
	public void enterCity() {
		
		Select select = new Select(City);
		select.selectByIndex(3);
	}
	
	public void enterothercity( ) {
		othercity.click();
	}
	
	public void selectSkils() {
		skill.click();
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}
