package com.truepush.qa.testcases;






import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.AWTException;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.qa.truepush.pages.CampaignPage;
import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;


@Listeners(com.qa.testlisteners.Testnglistener.class)

public class MaininterfaceTest  extends TestBase {

	
    
	Loginpage LoginPage;
	
	ProjectPage projectpage;
	
	DashboardPage dashboardpage;
	
	Maininterface maininterface;
	
	CampaignPage camp;
	

	

	public MaininterfaceTest() {
		
		super();

	}
	
	

	
	
	@BeforeMethod
	
	public void setup(){
		
		initialization();
          			
		LoginPage = new Loginpage();
		
		projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
		
		 projectpage = new ProjectPage();
		 		 
		 projectpage.clickOnProjectlink();

	     maininterface = new Maininterface();
	     
			report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);

	
	}
	
	
	
	
	@Test(priority = 1)
	
	public void validateCampaignPageLinkTest() throws Throwable {
		
		
			test = report.startTest("validate Campaign Page Link Test");
		
	//	test.log(LogStatus.INFO,  test.addScreenCapture(takeScreenShot(driver))+"execution has been started");
		
		maininterface.clickoncampaignlink();
		
	//	test.log(LogStatus.PASS, test.addScreenCapture(takeScreenShot(driver))+"test has been successfully executed");

		
	}
	
	
	
	@Test(priority = 2)
	
	public void validateRSSPageLinkTest() {
	
		test = report.startTest("validate RSS Page Link Test");

		maininterface.clickonrsslink();
		
	}
	
	
	
	@Test(priority = 3)
	
	public void validateSegmentsPageLinkTest() {
		
		test = report.startTest("validate Segments Page Link Test");

		maininterface.clickonsegmentslink();
		
	}
	
	@Test(priority = 4)
	
	public void validateTemplatesPageLinkTest() {
		
		test = report.startTest("validate Templates Page Link Test");

		
		maininterface.clickontemplateslink();
		
	}
	
	
	@Test(priority = 5)
	
	public void validateTriggersPageLinkTest() {
		
		test = report.startTest("validate Triggers Page Link Test");

		
		maininterface.clickontriggerslink();
		
	
		
		
	}
	
	@Test(priority = 6)
	
	public void valiateSubscribersPageLinkTest() {
		
		test = report.startTest("valiate Subscribers Page Link Test");

		
		maininterface.clickonsubscriberslink();
		
	}
	
	
	
	
	@Test(priority = 7)
	
	public void validateCodeIntegrationPageLinkTest() {
		
		test = report.startTest("validate CodeIntegration Page Link Test");

		maininterface.clickoncodeintegrationlink();
		
	}
	
	
	
	
	@Test(priority = 8)
	
	public void validateSettingsPageLinkTest() {
		 
		test = report.startTest("validate Settings Page Link Test");

		maininterface.clickonsettingslink();
		
	}
	
	
	
	
	@Test(priority = 9)
	
	public void validatePricingPageLinkTest() {
		
		test = report.startTest("validate Pricing Page Link Test");

		
		maininterface.clickonpricinglink();
		
	}
	
	
	
	@Test(priority = 10)
	
	public void validateProfileiconPageLinkTest() throws InterruptedException {
		
		test = report.startTest("validate Profileicon Page Link Test");

		
		Thread.sleep(2000);
		
		maininterface.verifyProfileIcon("icon", "chiluka1", "chiluka1");
		

	}
	
	@Test(priority = 12)
	
	public void validatePageTitleTest() {
		
		test = report.startTest("validate Page Title Test");

		 
				
				String title = maininterface.validatePageTilte();
				
				AssertJUnit.assertEquals(title, "Truepush","dash board page title not matched");
			} 
			

	@Test(priority = 13)

	
	public void validateCampaignButtonTest() throws AWTException {
		
		test = report.startTest("validate Campaign Button Test");

		
		maininterface.verifyCampaignButton();
		
		camp = new CampaignPage();
		
		camp.createSimpleCampaign("https://amazon.com", "jeff", "bezos");
		
//maininterface.verifyCampaignButton("https://amazon.com", "jeff", "bezos");
		
	}

		@Test(priority = 14)
		
		public void validateProfileIconTest() throws InterruptedException {
			
			test = report.startTest("validate ProfileIcon Test");

			
			Thread.sleep(2000);
			
			maininterface.verfiyProfileIcon();
			
			
		}  
		
		@Test(priority = 15)

		public void validateDriftChatTest() throws Exception {
			
			test = report.startTest("validate DriftChat Test");

			
			maininterface.verfiyDriftChat();
			
			
		}
		
			
		@Test(priority = 16 )

			public void validateMenuButtonTest() {
			
			test = report.startTest("validate Menu Button Test");

				
				maininterface.verfiyMenuButton();
				
		}
			
		@Test(priority = 17)

			public void validateSwitchToProjectTest() {
			
			test = report.startTest("validate Switch To Project Test");

			maininterface.verifySwichToProject("clone");
				
			
			}
		
		
		@Test(priority = 18)
		
		
		public void validateLogoutButtonTest() throws InterruptedException {
			
			
			test = report.startTest("validate Logout Button Test");
			
			Thread.sleep(2000);
			
		maininterface.verifyLogoutIcon();
			
		}
			
	
	
	@AfterMethod
     
 	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = MaininterfaceTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath)); //to add screenshot in extent report
 			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
 		}
 		else if(result.getStatus()==ITestResult.SKIP){
 			
 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 			
 			
 			test.log(LogStatus.FAIL, "TEST CASE SKIPPED IS "+result.getThrowable());
 			
 			String screenshotPath = MaininterfaceTest.getScreenshot(driver, result.getName());
 			
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 		
 		/*
 		else if(result.getStatus()==ITestResult.SUCCESS){
 			test.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
 			
 			String screenshotPath = MaininterfaceTest.getScreenshot(driver, result.getName());

            test.log(LogStatus.PASS,test.addScreenCapture(screenshotPath));
 		} */
 		
 		
 		report.endTest(test); //ending test and ends the current test and prepare to create html report
 		
 		driver.close();
     }
 
		
		  /*@Test

		public void verifyPageTitle() {
			
			String title = dashboardpage.validatePageTilte();
			
			Assert.assertEquals(title, "True push","dash board page title not matched");
		} */
		

}
