package com.truepush.qa.testcases;



import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.FeedbackPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class FeedbackTest extends TestBase{
	
	


	Loginpage loginpage;

	ProjectPage projectpage;
	
	
	
    Maininterface maininterface;	
    
    
    
    FeedbackPage feedbackpage;
    
	public FeedbackTest() {
		
		super();
	
	}
	
	
	
	
	@BeforeMethod
	
	public void setup() {

		initialization();
				 
		 loginpage = new Loginpage();
		 
	projectpage =  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));

		 projectpage = new ProjectPage();

		  projectpage.clickOnProjectlink();
		 		 
         maininterface = new Maininterface();	      
	      
	   maininterface.clickonfeedbacklink();
	      
	   
	   feedbackpage = new FeedbackPage();
          	}


	@Test
	
	public void verifyfeedbackform() {
		

	      test = report.startTest("verify feedback form");


		feedbackpage.feedbackForm("hello good morning", "have a nice day");
		
		
		
	}
	
	
		 
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = FeedbackTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 			else if(result.getStatus()==ITestResult.SKIP){
 				
 	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 	 			
 	 			String screenshotPath = FeedbackTest.getScreenshot(driver, result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			}
	
 		
 		report.endTest(test);
 		
 		driver.close();
	}
	
	

}
