package com.truepush.qa.testcases;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

import junit.framework.Assert;

public class DashboardTest extends TestBase{

    
	Loginpage LoginPage;
	
	ProjectPage projectpage;
	
	DashboardPage dashboardpage;
	

	public DashboardTest() {
		super();

	}
	
	
	@BeforeMethod
	
	public void setup() throws Exception {

		initialization();
				
		LoginPage = new Loginpage();
		
		projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
		
		 projectpage = new ProjectPage();
		 
		 dashboardpage = new DashboardPage();
		 
		dashboardpage =	projectpage.clickOnProjectlink();
		
		  Thread.sleep(2000);

	}
	

	@Test(priority = 12)
	
	public void verfiyTruepushLogo() {
		
		
	Boolean flag =	dashboardpage.truepushlogo();
	
	
	Assert.assertTrue(flag);
	
			}
	
	
	
	@Test(priority = 1)
	
	public void verifyCampaignPageLink() {
		
	dashboardpage.clickoncampaignlink();
		
	}
	
	
	
	@Test(priority = 2)
	
	public void verifyRSSPageLink() {
	
		dashboardpage.clickonrsslink();
		
	}
	
	
	
	@Test(priority = 3)
	
	public void verifySegmentsPageLink() {
		
		dashboardpage.clickonsegmentslink();
		
	}
	
	@Test(priority = 4)
	
	public void verifyTemplatesPageLink() {
		
		dashboardpage.clickontemplateslink();
		
	}
	
	
	@Test(priority = 5)
	
	public void verifyTriggersPageLink() {
		
		dashboardpage.clickontriggerslink();
		
	
		
		
	}
	
	@Test(priority = 6)
	
	public void verifySubscribersPageLink() {
		
		dashboardpage.clickonsubscriberslink();
		
	}
	
	
	
	
	@Test(priority = 7)
	
	public void verifyCodeIntegrationPageLink() {
		
		dashboardpage.clickoncodeintegrationlink();
		
	}
	
	
	
	
	@Test(priority = 8)
	
	public void verifySettingsPageLink() {
		
		dashboardpage.clickonsettingslink();
		
	}
	
	
	
	
	@Test(priority = 9)
	
	public void verifyPricingPageLink() {
		
		dashboardpage.clickonpricinglink();
		
	}
	
	
	
	@Test(priority = 1)
	
	public void verifyProfileiconPageLink() {
		
		dashboardpage.clickonprofileicon();
		

	}
	
	
	@Test(priority = 11)
	
	public void verifyWeeklyStatus() {
		
	boolean  flag =	dashboardpage.Weeklystats();
		
	Assert.assertTrue(flag);
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
