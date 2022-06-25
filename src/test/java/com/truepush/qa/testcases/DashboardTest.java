package com.truepush.qa.testcases;






import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.ITestResult;

import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
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
		  
			report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);

	}
	

	
	@Test
	
	public void verifyWeeklyStatusTest() {
		
		test = report.startTest("verify Weekly Status Test");
		
	boolean  flag =	dashboardpage.Weeklystats();
		
	AssertJUnit.assertTrue(flag);
	}
	

	
	@Test
	
	public void verifyRefreshiconTest() {
		
		test = report.startTest("verify Refresh icon Test");

		
		
		dashboardpage.clickonrefreshicon();
		
	}
	
	
	
	@Test
	
	public void verifyallcampaignslinkTest() {
		
		test = report.startTest("verify allcampaigns link Test");

		dashboardpage.clickonallcampaignslink();
		
		}
	
	
	@Test
	
	public void verifytotalsummaryTest() {
		
		test = report.startTest("verify total summary Test");

	boolean  flag =	dashboardpage.totalsummary();
		
	AssertJUnit.assertTrue(flag);
	
	}
	
	@Test
	
	public void verifylast2daysstatsTest() {
		
		test = report.startTest("verify last 2 days stats Test");

		
	boolean  flag =	dashboardpage.Last2daysstats();
		
	AssertJUnit.assertTrue(flag);
	
	}
	
	@Test
	
	public void verifylast5campaignsTest() {
		
		test = report.startTest("verify last 5 campaigns Test");

	boolean  flag =	dashboardpage.Lastcampaigns();
		
	AssertJUnit.assertTrue(flag);
	
	}
	
	
	
	
	@AfterMethod
	
public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = DashboardTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			
 		}	
 		
 		else if(result.getStatus()==ITestResult.SKIP) {
 			
 			
 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS"+result.getName());
 			
 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS"+result.getThrowable());
 			
 			String screenshotPath = DashboardTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
			
		report.endTest(test);	
			
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
