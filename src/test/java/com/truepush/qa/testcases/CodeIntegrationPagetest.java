package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.CodeIntegraionPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class CodeIntegrationPagetest extends TestBase{
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	CodeIntegraionPage code;
	
	public CodeIntegrationPagetest() {
		
		super();
		
		
	}
	
	
	
	@BeforeMethod
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
 
		         projectpage.clickOnProjectlink();
		 
          maininterface = new Maininterface();
          
          code = maininterface.clickoncodeintegrationlink();
          
          code = new CodeIntegraionPage();
	
	
	}
	
	
	
	@Test
	
	public void validateServiceWorkerTest() {
		
		test = report.startTest("validate ServiceWorker Test");
		
		code.verifyServiceWorker();
		
	}
	
	@Test
	
	public void validateCodeTest() {
		
		test = report.startTest("validate Code Test");

		
		code.verifyScripts();
		
	}
	
	
	@Test
	
	public void validateAMPPageTest() {
		
		test = report.startTest("validate AMP Page Test");

		
		
		code.verifyAMPPage();
		
	}
	
	
	@Test
	
	public void validateSendCodeTest() {
		
		test = report.startTest("validate Send Code Test");

		
code.verifySendCodeToDev("truepush1234@gmail.com");	

	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = CodeIntegrationPagetest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 			else if(result.getStatus()==ITestResult.SKIP){
 				
 	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, "TEST CASE FAILED IS "+result.getThrowable());
 	 			
 	 			String screenshotPath = CodeIntegrationPagetest.getScreenshot(driver, result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			}
	
 		
 		report.endTest(test);
 		
 		driver.close();
	}

}
