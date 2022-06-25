package com.truepush.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.NewProjectPage;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.RegistrationPage;
import com.qa.truepush.pages.SettingsPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class NewProjectPageTest extends TestBase{

	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	NewProjectPage project;
	
    SettingsPage setting;	
	
	public NewProjectPageTest() {
		
		super();
		
	}
	
	
	

	@BeforeClass
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
	
		 project = projectpage.clickOnNewProjectButton();
		 
	        project = new NewProjectPage();
	
	}
	
	
	
	@Test(priority = 1)
	
	public void validateNewProjectTest() {
		
		test = report.startTest("validate NewProject Test");
		
		project.createNewProject("hondashine");
		
	}
	
	
	@Test(priority = 2)
	
	
	public void validateNewProjectTest2() throws Exception{
		
		test = report.startTest("validate NewProject Test2");

		setting = new SettingsPage();
		
		setting.createNewProject("unstack-attacker.000webhostapp.com/", "welcome", "thank you for subscribing");
		
	}
	
	
	@Test(priority = 3)
	
	public void validateCodeIntegrationSetUpTest() {
		
		test = report.startTest("validate Code Integration SetUp Test");

		
		RegistrationPage register = new RegistrationPage();
		
		register.clickOnCodeIntegrate();
		
		
	}
	
	
	
	
	
	
	@AfterClass
	
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable());
 		//to add error/exception in extent report
 			
 			String screenshotPath = NewProjectPageTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = NewProjectPageTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	}
	
	
	
}
