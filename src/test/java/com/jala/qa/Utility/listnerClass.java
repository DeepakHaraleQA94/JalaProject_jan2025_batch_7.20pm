package com.jala.qa.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jala.qa.parentLayer.TestBase;



public class listnerClass  extends TestBase implements ITestListener{

	ExtentReports report = Utility.getExtentReport();
	ExtentTest eTest;
	
	
	public listnerClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
//	util screnshot1 = new util();
	public void onStart(ITestContext context) {
	   System.out.println("test class execution stared... ");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("test method execution started..." + result.getMethod().getMethodName());
	    String testName = result.getName();
		eTest = report.createTest(testName);
		eTest.log(Status.INFO,testName+" execution started");
	  }
	

	
	public void onTestSuccess(ITestResult result) {
		
	    System.out.println("Test case successfully passed.. " +result.getMethod().getMethodName() );
	    String testName = result.getName();
		eTest.log(Status.PASS,testName+" got successfully executed");
		
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test case method execution failed..."+ result.getMethod().getMethodName());
	    String testName = result.getName();
		eTest.log(Status.FAIL,testName+" got failed");
	    
//	    try {
//			screnshot1.screenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  
	  }
	
	public void onTestSkipped(ITestResult result) {
	   System.out.println("test case method execution skipped.. "+ result.getMethod().getMethodName());
	   String testName = result.getName();
		eTest.log(Status.SKIP,testName+" got skipped");
		eTest.log(Status.INFO,result.getThrowable());
	   
	  }
	
	 public void onFinish(ITestContext context) {
		 
			report.flush();
		    System.out.println("test execution completed");
		  }

}
