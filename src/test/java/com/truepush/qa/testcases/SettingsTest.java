package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.SettingsPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;

public class SettingsTest extends TestBase {
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	SettingsPage settings;
	
	
	public SettingsTest() {
		
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
       
         settings = maininterface.clickonsettingslink();
         
         settings = new SettingsPage();
	}
	


	
	@Test(priority = 1)
	
	public void validateRestAPIKeyTest() {
		
		
	boolean flag = 	settings.verifyRestApiKey();
		
		AssertJUnit.assertTrue(flag);
		
	}
	
	
     @Test(priority = 2)
	
	public void validateAPPIdTest() {
		
		
	boolean flag = 	settings.verifyAPPId();
		
		AssertJUnit.assertTrue(flag);
		
     }

     
     

 	@Test(priority = 3)
 	
 	public void validateRegnerateTokenTest() {
 		
 		settings.verifyRegenerateToken();
 		
 	}
 		
     
     

     @Test(priority = 4)
     
     public void validateMaxmimumNotificaionsInputBoxTest() {
    	 
    	 
    	 settings.verifyMaxmimumNotificaionsInputBox("3");
    	 
    	 
     }
     
     
 	@Test(priority = 5)
	
 	public void validateSettingsPageTest() {
 		
 		settings.editSettings("tinnier-chests.000webhostapp.com/");
 		
 	}
 	
 	
	
	@Test(priority = 6)
	
	public void validateDocumentationLinkTest() {
		
		
		settings.verifyDocumentationLink();
		
		
	}


	@Test(priority = 7)
	public void validateProjecticonTest() throws Exception {
		
		
		settings.verifyProjectIcon();
		
	}
	
	
	
	@Test(priority = 8)
	
	public void validateOptinStyleTest() {
		
		settings.verifyEditOptinStyle();
		
	}
	
	
	@Test(priority = 9)
	public void validateOptinContentTest() {
		
		
		settings.verifyOptinContent("Allow updates from truepush", "You can turn it off whenever you require",
				"never", "allow now");
		
	}

	@Test(priority = 10)
	public void validateWelcomenotificationTest() {
		
		
	settings.verifyWelcomeNotification("welcome", "thank you for subscribing");	
		
		
		
	}

	
     @Test(priority = 11)
     
      public void validateDefaultSettingsTest() {
	
	
	settings.verifyDefaultSettings();
	
          }

      
      @Test(priority = 0)
      
      public void validateGDPRTest() {
    	  
    	  settings.verifyGDPRLink();
    	  
      }

	
	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = SettingsTest.getScreenshot(driver, result.getName());
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = SettingsTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	
	}
	
	

   }
