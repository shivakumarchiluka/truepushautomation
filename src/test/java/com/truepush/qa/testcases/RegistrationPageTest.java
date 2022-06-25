package com.truepush.qa.testcases;




import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.truepush.pages.HomePage;
import com.qa.truepush.pages.RegistrationPage;
import com.qa.truepush.pages.SettingsPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class RegistrationPageTest extends TestBase {
	
    HomePage homepage;

	RegistrationPage register;
	
	SettingsPage settings;
	
	public 	RegistrationPageTest() {
		
		
		super();
		
	}
	
	
	
	
	@BeforeClass
	
	public void setup(){

		initialize();

		homepage = new HomePage();
		
		register = homepage.clickOnRegister();
		
		register = new RegistrationPage();
		
	
     	}

	
	
	@Test(priority = 1)
	
	public void validateRegistrationTest() throws Throwable {
		
		test = report.startTest("validate Registration Test");
		
  register.verifyRegistration("airindia", "jiciv1129@mahazai.com", "chiluka");	
  
  
	}
	
	@Test(priority = 2)
	
  public void validateNewProjectTest() throws Exception {
		
		test = report.startTest("validate New Project Test");
		
		Thread.sleep(2000);
		
		register.createNewProject("extent");
		
		settings = new SettingsPage();

		settings.createNewProject("candid-duplicates.000webhostapp.com/", "welcome", "thank you subscribing");
		
		register.clickOnCodeIntegrate();
		
	} 	
	
	
	
	
	
    @AfterClass
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = RegistrationPageTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = RegistrationPageTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 		
			report.endTest(test);
 		    
			
driver.quit();			


}
    }
