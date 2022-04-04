package com.truepush.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
	
	}
	
	
	

	@Test(priority = 11)
	
	public void verfiyTruepushLogo() {
		
		
	Boolean flag =	maininterface.truepushlogo();
	
	
	Assert.assertTrue(flag);
	
			}
	
	
	
	@Test(priority = 1)
	
	public void verifyCampaignPageLink() {
		
		maininterface.clickoncampaignlink();
		
	}
	
	
	
	@Test(priority = 2)
	
	public void verifyRSSPageLink() {
	
		maininterface.clickonrsslink();
		
	}
	
	
	
	@Test(priority = 3)
	
	public void verifySegmentsPageLink() {
		
		maininterface.clickonsegmentslink();
		
	}
	
	@Test(priority = 4)
	
	public void verifyTemplatesPageLink() {
		
		maininterface.clickontemplateslink();
		
	}
	
	
	@Test(priority = 5)
	
	public void verifyTriggersPageLink() {
		
		maininterface.clickontriggerslink();
		
	
		
		
	}
	
	@Test(priority = 6)
	
	public void verifySubscribersPageLink() {
		
		maininterface.clickonsubscriberslink();
		
	}
	
	
	
	
	@Test(priority = 7)
	
	public void verifyCodeIntegrationPageLink() {
		
		maininterface.clickoncodeintegrationlink();
		
	}
	
	
	
	
	@Test(priority = 8)
	
	public void verifySettingsPageLink() {
		
		maininterface.clickonsettingslink();
		
	}
	
	
	
	
	@Test(priority = 9)
	
	public void verifyPricingPageLink() {
		
		maininterface.clickonpricinglink();
		
	}
	
	
	
	@Test(priority = 10)
	
	public void verifyProfileiconPageLink() {
		
		maininterface.clickonprofileicon();
		

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
