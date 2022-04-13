package com.truepush.qa.testcases;


import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.CampaignPage;
import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;


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
		 
		 projectpage.clickonproject();

	     maininterface = new Maininterface();
	
	}
	
	
	

	@Test(priority = 11)
	
	public void validateTruepushLogoTest() {
		
		
	Boolean flag =	maininterface.truepushlogo();
	
	
	Assert.assertTrue(flag);
	
			}
	
	
	
	@Test(priority = 1)
	
	public void validateCampaignPageLinkTest() {
		
		maininterface.clickoncampaignlink();
		
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
	
	public void validateProfileiconPageLinkTest() {
		
		maininterface.clickonprofileicon();
		

	}
	
	@Test(priority = 12)
	
	public void validatePageTitleTest() {
		
		 
				
				String title = maininterface.validatePageTilte();
				
				Assert.assertEquals(title, "Truepush","dash board page title not matched");
			} 
			

	@Test(priority = 13)

	
	public void validateCampaignButtonTest() {
		
		maininterface.verifyCampaignButton();
		
		camp = new CampaignPage();
		
		camp.createSimpleCampaign("https://amazon.com", "jeff", "bezos");
		
//maininterface.verifyCampaignButton("https://amazon.com", "jeff", "bezos");

		
	}
	
     @AfterMethod
     
     public void teardown() {
    	 
    	 driver.close();
    	 
    	 
     }


		
		  /*@Test

		public void verifyPageTitle() {
			
			String title = dashboardpage.validatePageTilte();
			
			Assert.assertEquals(title, "True push","dash board page title not matched");
		} */
		

}
