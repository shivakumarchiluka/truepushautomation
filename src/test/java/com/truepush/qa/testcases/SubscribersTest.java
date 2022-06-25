package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.SubscribersPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class SubscribersTest extends TestBase{
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	SubscribersPage subscriber;
	
	
	public SubscribersTest() {
		
		
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
         
         subscriber = maininterface.clickonsubscriberslink();
         
         subscriber = new   SubscribersPage();
         
	}

	
	
	@Test(priority = 1)
	
	public void validateCategoryWiseStatsTest() {
		
		test = report.startTest("validate Category Wise Stats Test");
		
		subscriber.verifyCategoryWiseStats();
		
	}	
	
	
	@Test(priority = 2)
	public void validateBrowsersWiseSubscribersTest() {
		
		test = report.startTest("validate Browsers Wise Subscribers Test");

		
	boolean flag =	subscriber.verifyBrowsersWiseSubscribers();
	
    AssertJUnit.assertTrue(flag);	
    
	}
	
	
	@Test(priority = 3)
	
	public void validatePlatformWiseSubscribersTest() {
		
		test = report.startTest("validate Platform Wise Subscribers Test");

	boolean flag =	subscriber.verifyPlatformWiseSubscribers();
	
    AssertJUnit.assertTrue(flag);	
	}
	
	
	@Test(priority = 4)
	
	public void validateCountryWiseSubscribersTest() {
		
		test = report.startTest("validate Country Wise Subscribers Test(");

		
	boolean flag =	subscriber.verifyCountryWiseSubscribers();
	
    AssertJUnit.assertTrue(flag);
    
	}
	

	
	@Test(priority = 5)
	
	public void  validateSubscribersIdTest() throws AWTException {
		
		test = report.startTest("validate Subscribers Id Test");

		
		subscriber.verifySubscribersUsingID("6221a71b75c57caca84c410");
		
	}
	
	
	@Test(priority = 6)

	 public void validateSubscribersDateRangeTest() throws AWTException {
	
		
		test = report.startTest("validate Subscribers Date Range Test");

       subscriber.verifySubscribersUsingDate("2022/2/17 - 2022/3/8");		
	}

	
	@Test(priority = 7)
	
	 public void validateSubscribersStatusTest() {
		
		test = report.startTest("validate Subscribers Status Test");

		
		subscriber.verifySubscribersStatus();
		
	}

	@Test(priority = 8)

	public void validateTestUsersTest() {
		
		test = report.startTest("validate Test Users Test");

		
		subscriber.verifyTestUsers();
		
	}
		
	
	
@AfterMethod

public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			
			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			
		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotPath = SubscribersTest.getScreenshot(driver, result.getName());
			
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			
		}
		
	else if(result.getStatus()==ITestResult.SKIP){
			
 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 			
 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
 			
 			String screenshotPath = SubscribersTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			
	}
			report.endTest(test);
			
			driver.close();


}

}
