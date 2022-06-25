package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.TriggersPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;
import com.truepush.qa.utilities.Testut;

public class TriggerTest extends TestBase{
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	TriggersPage trigger;
	
	 String sheetName = "sheet1";
	 

	
	public TriggerTest() {
		
		super();
	
	}
	
	
	
	
	@BeforeMethod
	
	public void setup() {     

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickOnProjectlink();
		
         maininterface = new Maininterface();

		 
			trigger = maininterface.clickontriggerslink();

		 trigger = new TriggersPage();
		 
		 report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html",true);
       
		 
	}
	
	
	@Test (priority = 1)
	
	public void validateCreateTriggerTest() {
		
 test = report.startTest("create Trigger Test");
 
		trigger.CreateTrigger("w3schools", "programming languages");
		
		trigger.sendttriggerrepeatedly("10", "37");
		
	}
	
	@DataProvider
	public Object[][] triggertestdata() {
		
		Object data[][]=Testut.getTriggerTestData(sheetName);
		
		return data;
	}
	
	@Test( priority = 2,dataProvider = "triggertestdata")
	
	public void validateCreateTriggerDDTTest(String TriggerName ,String TriggerNotes,String HH , String MM) {
		
		test = report.startTest("create Trigger Data driven Test");
		
		trigger.createTriggerDDT(TriggerName, TriggerNotes, HH, MM);
		
	}
		

	
	
	@Test(priority = 3)
	
	public void editTriggerTest() {
		
		test = report.startTest("Edit Trigger Test");

		
		trigger.editTrigger("11", "09");		
		
	} 
	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 		
 			
 			String screenshotPath = TriggerTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = TriggerTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	
 		
	}

	
}
