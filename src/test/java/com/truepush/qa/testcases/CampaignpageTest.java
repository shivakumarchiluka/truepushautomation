package com.truepush.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.truepush.pages.CampaignPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;
import com.truepush.qa.utilities.Testut;

public class CampaignpageTest extends TestBase {
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	CampaignPage campaignpage;
	
	
	String sheetName = "sheet1";
	
	public CampaignpageTest() {
		
		super();
	


	}
	
	@BeforeMethod
	
	public void setup() throws Throwable   {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickOnProjectlink();
		 
          maininterface = new Maininterface();
          
			campaignpage =  maininterface.clickoncampaignlink();
			
			  campaignpage = new CampaignPage();


     	}
	
	
	
	
	@DataProvider
	
	public Object[][] campaigntestData() {
		
		Object data[][]=Testut.getCampaignTestData(sheetName);
		
		return data;
		
	}
	
	
	
	@Test(priority = 0 ,dataProvider = "campaigntestData")
	
	public void validateCampaignPage(String Enterurl, String Entertitle, String Entermessage) {

		
        campaignpage.clickoncreatecampaignDTT(Enterurl, Entertitle, Entermessage);
	}
	
	
	/*@Test(dataProvider = "campaigntestdata")
	
	public void validateCampaignPage(String Enterurl, String Entertitle, String Entermessage) {

	
	
        campaignpage.clickoncreatecampaignDTT(Enterurl, Entertitle, Entermessage);}	*/
		
		
	
	
	
	@Test(priority = 1)
	
	public void validateCampaignTest() throws AWTException {
		
		campaignpage.clickOnCampaignButton();
		
		campaignpage.createSimpleCampaign("https://microsoft.com","google","sundarpichai");
		
	}
	
	
	@Test(priority = 2)
	
	public void validateAdvanceCampaignTest() throws Throwable {
		
		
		campaignpage.clickOnCampaignButton();
		
		campaignpage.createSimpleCampaign("https://apple.com","apple","stevejobs");
		
		campaignpage.createSimpleCampaign("browser");
		
		campaignpage.creatSendLaterCampaign();
		
		campaignpage.createcampaign("tap", "https://amazon.com", "sun");
		
	    campaignpage.sendNotification();
		

	
		
		
	}
	
	
	
	
	@Test(priority = 3)
	
	public void validateTruepushLogoTest() throws IOException {
		
	
	boolean flag =	maininterface.truepushlogo();
	
	
	Assert.assertTrue(flag);
	
	
			}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	

}
