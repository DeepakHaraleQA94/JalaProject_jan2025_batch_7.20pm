package com.jala.qa.parentLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class TestBase {
	public static  Properties prop;
	public static WebDriver driver;
	public  TestBase() throws IOException{
		 prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse-workspace\\HybrideFramework_Jan2025\\src\\main\\java\\com\\jala\\qa\\enviromentLayer\\Config.properties");
		prop.load(file);
	}
	

	public static void intilization() {
		String browserName = prop.getProperty("browsername");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
	
	
}
