package com.truepush.qa.testcases;


import org.testng.annotations.Test;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.RSSPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
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

		 projectpage.clickOnProjectlink();
		 
          maininterface = new Maininterface();
          
       rsspage =  maininterface.clickonrsslink();
       
       rsspage  = new RSSPage();
       
		report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);

          
	}
	
	
	
	
	@Test(priority = 1)
	
	public void validateCreateNewRSSTest()  {
		
		test  =	report.startTest("create New RSS Test");

		
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
	
	public void validateAddRSSFeedsDTTTest(String RSSname ,String RSSlink , CharSequence[] DelayNotification) throws Exception {
		
	test  =	report.startTest("Add New RSS Feed Test");
	
    rsspage.addNewRSS();
 
 
rsspage.clickOnAddNewRSSFeed(RSSname, RSSlink, DelayNotification);

		rsspage.clickAddRSS();
		
	}
	
	
	
	  @Test	(priority = 3)
		public void validateActiveRSSfeedsTest() throws Throwable {
		
			test  =	report.startTest("Validate RSS feeds Test");
 
 rsspage.clicklabel1Activebutton();
 
 Thread.sleep(1000);
					
          rsspage.clicklabel2Activebutton();
 
          Thread.sleep(1000);

   rsspage.clicklabel3Activebutton();
   
   
   Thread.sleep(1000);

 
                         rsspage.clicklabel4Activebutton();
                         
                         
                         Thread.sleep(1000);

 
 rsspage.clicklabel5Activebutton();
		
 Thread.sleep(1000);

		rsspage.clickOnNextPage();
		
		 Thread.sleep(1000);

		
		            rsspage.clicklabel1Activebutton();
		            
		            Thread.sleep(1000);

			
		 rsspage.clicklabel2Activebutton();
		 
		 Thread.sleep(1000);

		 
	                              	 rsspage.clicklabel3Activebutton();
	                              	 
	                              	 Thread.sleep(1000);

		 
		 rsspage.clicklabel4Activebutton();
		 
		 Thread.sleep(1000);

		 
	                	 rsspage.clicklabel5Activebutton();
	                	 
	                	 Thread.sleep(1000);


	                		rsspage.clickOnNextPage();
	                		
	                		 Thread.sleep(1000);

	                		
	    		            rsspage.clicklabel1Activebutton();
	    		            
	    		            Thread.sleep(1000);

	    			
	    		 rsspage.clicklabel2Activebutton();
	    		 
	    		 Thread.sleep(1000);
	    		 

	    		 
	    	                              	 rsspage.clicklabel3Activebutton();
	    	                              	 
	    	                              	 Thread.sleep(1000);

	    		 
	    		 rsspage.clicklabel4Activebutton();
	    		 
	    		 Thread.sleep(1000);

	    		 
	    	                	 rsspage.clicklabel5Activebutton();
	    	                	 
	    	                	 Thread.sleep(1000);


	    	             		
	    	             		rsspage.clickOnNextPage();
	    	             		
	    	             		 Thread.sleep(1000);

	    	             		
	    	             		            rsspage.clicklabel1Activebutton();
	    	             		            
	    	             		           Thread.sleep(1000);

	    	             			
	
	
		
	}

	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = RSSTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = RSSTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
