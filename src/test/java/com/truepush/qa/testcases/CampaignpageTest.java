package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import java.awt.AWTException;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.qa.truepush.pages.CampaignPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
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
			  
			  
				report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);



     	}
	
	
	
	
	@DataProvider
	
	public Object[][] campaigntestData() {
		
		Object data[][]=Testut.getCampaignTestData(sheetName);
		
		return data;
		
	}
	
	
	
	@Test(priority = 0 ,dataProvider = "campaigntestData")
	
	public void validateCreateCampaignsDTTTest(String Enterurl, String Entertitle, String Entermessage) {

		
		test = report.startTest("validate CreateCampaigns data driven Test");
		
        campaignpage.clickoncreatecampaignDTT(Enterurl, Entertitle, Entermessage);
	}
	
	
	/*@Test(dataProvider = "campaigntestdata")
	
	public void validateCampaignPage(String Enterurl, String Entertitle, String Entermessage) {

	
	
        campaignpage.clickoncreatecampaignDTT(Enterurl, Entertitle, Entermessage);}	*/
		
		
	
	
	
	@Test(priority = 1)
	
	public void validateCreateCampaignTest() throws AWTException {
		
		test = report.startTest("validate campaign Test");
		
		campaignpage.clickOnCampaignButton();
		
		campaignpage.createSimpleCampaign("https://microsoft.com","google","sundarpichai");
		
	}
	
	
	@Test(priority = 2)
	
	public void validateAdvancedCampaignTest() throws Throwable {
		
		test = report.startTest("validate advance campaign Test");
		
		campaignpage.clickOnCampaignButton();
		
		campaignpage.createSimpleCampaign("https://apple.com","apple","stevejobs");
		
		campaignpage.createSimpleCampaign("browser");
		
		campaignpage.creatSendLaterCampaign();
		
		campaignpage.createcampaign("tap", "https://amazon.com", "sun");
		
	    campaignpage.sendNotification();
		

	
		
		
	}
	
	
	
	
	@Test(priority = 3)
	
	public void validateTruepushLogoTest() throws IOException {
		
		test = report.startTest("validate Truepush logo Test");
	
	boolean flag =	maininterface.truepushlogo();
	
	
	Assert.assertTrue(flag);
	
	
			}
	
	
	
	@AfterMethod
	
 	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
 			//to add name in extent report
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = CampaignpageTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 		}
 			else if(result.getStatus()==ITestResult.SKIP){
 				
 	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
 	 			
 	 			String screenshotPath = CampaignpageTest.getScreenshot(driver, result.getName());
 	 			
 	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			}
 	 	/*	if(result.getStatus()==ITestResult.SUCCESS){
 	 			
 	 			test.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
 	 			
 	 			String screenshotPath =  CampaignpageTest.getScreenshot(driver, result.getName());

 	            test.log(LogStatus.PASS,test.addScreenCapture(screenshotPath));
 	 		
 	 		}*/
 		
 			report.endTest(test);
 			
 			driver.close();
 		
 		
	}
	
	

}
