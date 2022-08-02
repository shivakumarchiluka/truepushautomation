package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.HomePage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class LoginTest extends TestBase {

	ProjectPage projectpage;
	
	HomePage homepage;
	
	Loginpage  login;
	
	public LoginTest() {
		
		super();
		
	}
	
	//initialization();is called from the parent class or base class

	
	 @BeforeMethod
	 public void setUP() {
		 
		 initialization();		 
		 
       login = new Loginpage();
       
       projectpage = new ProjectPage();
	 }
	
	 
	 @Test
	 public void validateLoginTest() {
		 
		 test = report.startTest("validate login test");
		 
		projectpage = login.Validatelogin(prop.getProperty("email"),prop.getProperty("password"));
		 
		// project page = login.Validatelogin("cetare7393@qqhow.com", "chiluka");
		
		System.out.println("successfully logined into the truepush account");
	 }
	 
	 @Test
	 
	 public void validateLoginWithInvalidEmailTest() {
		 
		 
		 login.Validatelogin("safsadffsfd@.com","chiluka");
		 
	 	 projectpage.clickOnProjectlink();
		 
		 
	 }
	 
	 @Test
	 
	 public void validateLoginWithInvalidPasswordTest() {
		 
		 
		 login.Validatelogin("mozillachrome35@outlook.com","chilu");
		 
	 	 projectpage.clickOnProjectlink();
		 
		 
	 }
	 
	 @Test
	 
	 public void validateLoginWithBlankDataTest() {
		 
		 
		 login.Validatelogin("","");
		 
	 	 projectpage.clickOnProjectlink();
		 
		 
	 }
	 
	 @Test
	 
	 public void validateLoginWithInvalidDataTest() {
		 
		 
		 login.Validatelogin("safsadffsfd","chilu");
		 
	 	 projectpage.clickOnProjectlink();
		 
		 
	 }
	 
	 @Test
	 
	 public void validateForgotPasswordLinkTest() {
		 
		 login.validateForgotPasswordLink("mozillachrome35@outlook.com","mozillachrome35@outlook.com");
		 
	 }
	 
	 
	 
	 
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = LoginTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 			else if(result.getStatus()==ITestResult.SKIP){
 				
 	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 	 			
 	 			String screenshotPath = LoginTest.getScreenshot(driver, result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			}
	
 		
 		report.endTest(test);
 		
 		driver.close();
	}

	
	
}
