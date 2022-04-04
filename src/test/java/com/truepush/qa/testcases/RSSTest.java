package com.truepush.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.RSSPage;
import com.truepush.qa.testbase.TestBase;
import com.truepush.qa.utilities.Testut;

public class RSSTest extends TestBase{
	

	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
    
	
	RSSPage rsspage;
	
	String sheetName = "sheet1";

	
	public RSSTest() {
		
		super();
	
	}
	

	@BeforeMethod
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickonproject();
		 
          maininterface = new Maininterface();
          
       rsspage =  maininterface.clickonrsslink();
       
       rsspage  = new RSSPage();
          
	}
	
	
	
	
	@Test(priority = 1)
	
	public void createNewRSS()  {
		
		rsspage.createrssfeedbutton();
		  
		
 rsspage.createRss("news","https://news.un.org/feed/subscribe/en/news/region/europe/feed/rss.xml", "1"); 
 

		rsspage.clickAddRSS();

	}
	
	
	@DataProvider
	public Object[][] RSStestdata() {
		Object data[][]=Testut.getRSSTestData(sheetName);
		return data;
	}
	
	
	
	
	@Test(priority = 2 ,dataProvider = "RSStestdata")
	
	public void addNewRSSFeed(String RSSname ,String RSSlink , CharSequence[] DelayNotification) throws Exception {
		
    rsspage.addNewRSS();
 
 
rsspage.clickOnAddNewRSSFeed(RSSname, RSSlink, DelayNotification);

		rsspage.clickAddRSS();
		
	}
	
	
	
	  @Test	
		public void validateRSSfeeds() {
		
 rsspage.clicklabel1Activebutton();
					
          rsspage.clicklabel2Activebutton();
 
   rsspage.clicklabel3Activebutton();
 
                         rsspage.clicklabel4Activebutton();
 
 rsspage.clicklabel5Activebutton();
		
		rsspage.clickOnNextPage();
		
		            rsspage.clicklabel1Activebutton();
			
		 rsspage.clicklabel2Activebutton();
		 
	                              	 rsspage.clicklabel3Activebutton();
		 
		 rsspage.clicklabel4Activebutton();
		 
	                	 rsspage.clicklabel5Activebutton();

			rsspage.clickOnNextPage();
			
	                         		 rsspage.clicklabel1Activebutton();
				
			 rsspage.clicklabel2Activebutton();
		
	}

	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
