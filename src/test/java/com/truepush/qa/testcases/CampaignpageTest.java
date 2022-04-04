package com.truepush.qa.testcases;

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
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickOnProjectlink();
		 
          maininterface = new Maininterface();
          
          
		  campaignpage = new CampaignPage();

			campaignpage =  maininterface.clickoncampaignlink();

     	}
	
	
	
	
	@DataProvider
	public Object[][] campaigntestdata() {
		Object data[][]=Testut.getCampaignTestData(sheetName);
		return data;
		
	}
	
	
	
	@Test(dataProvider = "campaigntestdata")
	public void validateCampaignPage(String Enterurl, String Entertitle, String Entermessage) {

	
	
        campaignpage.clickoncreatecampaign(Enterurl, Entertitle, Entermessage);	
		
      campaignpage.ClickonSendnotification();
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
