package com.jala.qa.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends com.jala.qa.parentLayer.TestBase {
	WebDriver driver;
	@FindBy(xpath = "//h1[text()='Welcome to JALA Academy']")
	WebElement homeText;
	
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOutBtn;
	
	@FindBy(xpath = "/html/body/div[2]/aside/section/div/div[1]/img")
	WebElement userImage;
	
	@FindBy (linkText = "Home")
	WebElement homeTab;
	
	@FindBy (linkText = "Employee")
	WebElement employeeTab;
	
	@FindBy(linkText = "Create")
	WebElement createTab;
	
	@FindBy(linkText = "Search")
	WebElement searchTab;
	
	@FindBy (linkText = "More")
	WebElement moreTab;
	
    @FindBy(linkText = " Multiple Tabs")
	WebElement multipleTabs;
    
    @FindBy(linkText ="menu")
    WebElement menuTab;
    
	@FindBy(linkText = "Autocomplete")
	WebElement autocompleteTab;
	
	@FindBy(linkText = "Collapsible Content")
	WebElement collapsibleContentTab;
	
	@FindBy(linkText = " Images")
	WebElement  imagesTab;
	
	@FindBy(linkText = " Slider")
	WebElement   sliderTab;
	
	@FindBy(linkText = "Tooltips")
	WebElement tooltipsTab;
	
	@FindBy(linkText = "Popus")
	WebElement popusTab;
	
	@FindBy(linkText = "Links")
	WebElement linksTab;
	
	
	@FindBy(linkText = "CSS Properties")
	WebElement  CSSPropertiesTab;
	
	@FindBy(linkText = "iFrames")
	WebElement  iFramesTab;
	
	@FindBy(linkText = "Settings")
	WebElement  settingsTab;
	

public HomePage()throws IOException {
	PageFactory.initElements(driver, this);
}
public boolean validateHomeText() {
	boolean text = homeText.isDisplayed();
	return text;
}
public void clickOnLogOutBtn() {
	logOutBtn.click();
}

public void clickOnEmployeeTab() {
	employeeTab.click();
	createTab.click();
}
public WebElement getUserImage() {
    return userImage;
}
public void clickOnHomeTab() {
    homeTab.click();
}
public void clickOnSearchTab() {
    searchTab.click();
}
public void clickOnMoreTab() {
    moreTab.click();
}

public void clickOnMultipleTabs() {
    multipleTabs.click();
}

public void clickOnMenuTab() {
    menuTab.click();
}

public void clickOnAutocompleteTab() {
    autocompleteTab.click();
}

public void clickOnCollapsibleContentTab() {
    collapsibleContentTab.click();
}

public void clickOnImagesTab() {
    imagesTab.click();
}

public void clickOnSliderTab() {
    sliderTab.click();
}

public void clickOnTooltipsTab() {
    tooltipsTab.click();
}
public void clickOnLinksTab() {
    linksTab.click();
}


public void clickOnCSSPropertiesTab() {
    CSSPropertiesTab.click();
}

public void clickOnIFramesTab() {
    iFramesTab.click();
}
public void clickOnSettingsTab() {
    settingsTab.click();
}

}
