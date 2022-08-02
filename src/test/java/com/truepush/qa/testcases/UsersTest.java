package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.UsersPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;




  //  @Listeners(TestngListener.class)
public class UsersTest extends TestBase{

	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	UsersPage userspage;
	
	public UsersTest() {
		
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setup() {

		initialization();
				 
		 loginpage = new Loginpage();		

		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
		 
	///	 userspage = projectpage.clickOnUserslink();
		 
		 userspage = new UsersPage();
		 
	   }
	
	
	
	    @Test
	    
	    public void validateAddNewUsersTest() {
	    	
	    	test = report.startTest("validate Add New Users Test");
	    	
	    	userspage.addNewUser("waynews8899@gmail.com", "chiluka@19997");
	    	
	    	userspage.addNewUser();
	    	
	    }
	    
	
	
	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = UsersTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 			else if(result.getStatus()==ITestResult.SKIP){
 				
 	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());

 	 			
 	 			String screenshotPath = UsersTest.getScreenshot(driver, result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			}
	
 		
 		report.endTest(test);
 		
 		driver.close();
	}

	}
	
	//<parameter name="url" value="tinnier-chests.000webhostapp.com/"></parameter>


	//<methods> <include name="validateSettingsPage"></include>

	

