package com.truepush.qa.testcases;






import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;


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
		 		 
		   dashboardpage =   projectpage.clickOnProjectlink();
		     
			 dashboardpage = new DashboardPage();

		
		  Thread.sleep(2000);

	}
	

	
	@Test
	
	public void verifyWeeklyStatus() {
		
	boolean  flag =	dashboardpage.Weeklystats();
		
	Assert.assertTrue(flag);
	}
	

	
	@Test
	
	public void verifyRefreshicon() {
		
		dashboardpage.clickonrefreshicon();
		
	}
	
	
	
	@Test
	
	public void verifyallcampaignslink() {
		
		dashboardpage.clickonallcampaignslink();
		
		}
	
	
	@Test
	
	public void verifytotalsummary() {
		
	boolean  flag =	dashboardpage.totalsummary();
		
	Assert.assertTrue(flag);
	
	}
	
	@Test
	
	public void verifylast2daysstats() {
		
	boolean  flag =	dashboardpage.Last2daysstats();
		
	Assert.assertTrue(flag);
	
	}
	
	@Test
	
	public void verifylast5campaigns() {
		
	boolean  flag =	dashboardpage.Lastcampaigns();
		
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
	} 
		@Test
	
	public void verifyOptinguidelink() {
		
		dashboardpage.clickonoptinguidelink();
	}
	
	*/
	
	
}
