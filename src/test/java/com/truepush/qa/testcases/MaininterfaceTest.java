package com.truepush.qa.testcases;


import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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
	
          
		report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);
			
		LoginPage = new Loginpage();
		
		projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
		
		 projectpage = new ProjectPage();
		 		 
		 projectpage.clickOnProjectlink();

	     maininterface = new Maininterface();
	
	}
	
	
	
	
	@Test(priority = 1)
	
	public void validateCampaignPageLinkTest() throws Throwable {
		
		test = report.startTest("validateCampaignPageLinkTest");
		
		test.log(LogStatus.INFO,  test.addScreenCapture(takeScreenShot(driver))+"execution has been started");
		
		maininterface.clickoncampaignlink();
		
	//	test.log(LogStatus.PASS, test.addScreenCapture(takeScreenShot(driver))+"test has been successfully executed");

		
	}
	
	
	
	@Test(priority = 2)
	
	public void validateRSSPageLinkTest() {
	
		maininterface.clickonrsslink();
		
	}
	
	
	
	@Test(priority = 3)
	
	public void validateSegmentsPageLinkTest() {
		
		maininterface.clickonsegmentslink();
		
	}
	
	@Test(priority = 4)
	
	public void validateTemplatesPageLinkTest() {
		
		maininterface.clickontemplateslink();
		
	}
	
	
	@Test(priority = 5)
	
	public void validateTriggersPageLinkTest() {
		
		maininterface.clickontriggerslink();
		
	
		
		
	}
	
	@Test(priority = 6)
	
	public void valiateSubscribersPageLinkTest() {
		
		maininterface.clickonsubscriberslink();
		
	}
	
	
	
	
	@Test(priority = 7)
	
	public void validateCodeIntegrationPageLinkTest() {
		
		maininterface.clickoncodeintegrationlink();
		
	}
	
	
	
	
	@Test(priority = 8)
	
	public void validateSettingsPageLinkTest() {
		
		maininterface.clickonsettingslink();
		
	}
	
	
	
	
	@Test(priority = 9)
	
	public void validatePricingPageLinkTest() {
		
		maininterface.clickonpricinglink();
		
	}
	
	
	
	@Test(priority = 10)
	
	public void validateProfileiconPageLinkTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		maininterface.verifyProfileIcon("icon", "chiluk@1997", "chiluk@1997");
		

	}
	
	@Test(priority = 12)
	
	public void validatePageTitleTest() {
		
		 
				
				String title = maininterface.validatePageTilte();
				
				Assert.assertEquals(title, "Truepush","dash board page title not matched");
			} 
			

	@Test(priority = 13)

	
	public void validateCampaignButtonTest() throws AWTException {
		
		maininterface.verifyCampaignButton();
		
		camp = new CampaignPage();
		
		camp.createSimpleCampaign("https://amazon.com", "jeff", "bezos");
		
//maininterface.verifyCampaignButton("https://amazon.com", "jeff", "bezos");
		
	}

		@Test(priority = 14)
		
		public void validateProfileIconTest() throws InterruptedException {
			
			Thread.sleep(2000);
			
			maininterface.verfiyProfileIcon();
			
			
		}
		
		@Test(priority = 15)

		public void validateDriftChat() {
			
			maininterface.verfiyDriftChat();
		}
		
			
		@Test(priority = 16)

			public void validateMenuButton() {
				
				maininterface.verfiyMenuButton();
				
		}
			
		@Test(priority = 17)

			public void validateSwichToProject() {
			
			maininterface.verifySwichToProject("clone");
				
			
			}
			
	
	
     @AfterMethod
     
     public void teardown(){
    	
    
    	 driver.close();
    	 
    	 report.endTest(test);
    	 
    	 report.flush();
    	 
     }
 
		
		  /*@Test

		public void verifyPageTitle() {
			
			String title = dashboardpage.validatePageTilte();
			
			Assert.assertEquals(title, "True push","dash board page title not matched");
		} */
		

}
