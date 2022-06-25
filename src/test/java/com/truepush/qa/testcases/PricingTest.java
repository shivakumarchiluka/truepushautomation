package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.PricingPage;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class PricingTest extends TestBase{
	
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	PricingPage pricing;
	
	
	public PricingTest() {
		
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
         
         pricing = maininterface.clickonpricinglink();
    
          
         pricing = new PricingPage();
         
	}
    
	
		
		@Test
		
		public void validateCurrentProjectTest() {
			
			test = report.startTest("validate Current Project Test");
			
		boolean flag =	pricing.CurrentProject();
		
		AssertJUnit.assertTrue(flag);
			
			
		}
		
		@Test
		
		public void validateCurrentProjectSubscribersTest() {
			
			test = report.startTest("validate Current Project Subscribers Test");

			
		boolean flag =	pricing.currentprojectSubscribers();
		
		AssertJUnit.assertTrue(flag);
			
			
		}
		
		
		
		   @Test
		   
		   public void validateCurrentProjectPricingTest() { 
			   
			   
				test = report.startTest("validate Current Project Pricing Test");
 
			   
			 boolean flag =   pricing.currentProjectPricing();
			   
			   AssertJUnit.assertTrue(flag);
		   }
		
		
		
		
		
		   @Test
		   
		   public void validatePaymentTest() { 
			   
			   
				test = report.startTest("validate Payment Test");

			   
			   pricing.currentProjectPayment();
			   
			   
		   }

		
		
		@Test
		
		public void validateAllProjectTest() {
			
			
			test = report.startTest("validate AllProjects Test");

			
		boolean flag =	pricing.allProjects();
		
		AssertJUnit.assertTrue(flag);
			
			
		}
		

		   
		   
			@Test
			
			public void validateAllProjectsSubscribersTest() {
				
				
				test = report.startTest("validate AllProjects Subscribers Test");

				
			boolean flag =	pricing.allprojectsSubscribers();
			
			AssertJUnit.assertTrue(flag);
				
				
			}
			
			
			
			   @Test
			   
			   public void validateAllProjectsPricingTest() { 
				   
				   
					test = report.startTest("validate All Projects Pricing Test");

				   
				boolean flag =   pricing.allProjectsPricing();
				   
				   AssertJUnit.assertTrue(flag);
			   }
			   
			
			
			
			   @Test
			   
			   public void validatePaymentOverviewTest() { 
				   
				   
					test = report.startTest("validate Payment Overview Test");

				   
				   pricing.allProjectsPayment();
				   
				   
			   }
			   
		   
		
	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = PricingTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = PricingTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	}
	
		

	

}
