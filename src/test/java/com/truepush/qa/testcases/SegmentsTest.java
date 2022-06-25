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
import com.qa.truepush.pages.SegmentsPage;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;
import com.truepush.qa.utilities.Testut;

public class SegmentsTest extends TestBase {
	
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	
	SegmentsPage segment;
	
	
	 String sheetName = "sheet1";
	
	public SegmentsTest() {
		
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
	
	           segment = maininterface.clickonsegmentslink();
	           
	           segment = new SegmentsPage();
	}
	
	
	
	
	
	@Test(priority = 1)
	
	public void validateSegmentCreationTest() {
		
		test = report.startTest("validate Segment Creation Test");
		
		segment.createSegment("hyderabad", "telangana");
		
	segment.createSegment();
		
		
		
	}
	
	@DataProvider
	public Object[][] Segmenttestdata() {
		
		Object data[][]=Testut.getSegmentTestData(sheetName);
		
		return data;
	}
	
	
	@Test( priority = 2,dataProvider = "Segmenttestdata")
	
	public void validateSegmentCreationDDTTest(String SegmentName ,String SegmentNotes) {
		
		test = report.startTest("validate Segment Creation Data driven Test");

		
		segment.createSegmentDDT(SegmentName, SegmentNotes);
		
	} 
		
		
		@Test(priority = 3)
		
		public void validateSegmentEditFeatureTest() {
			
			test = report.startTest("validate Segment Edit Feature Test");

		
			
		segment.editSegment("TS PARTY");
		
		segment.editsegment();
		
		
	}
	
	
	//WebDriverWait wait = new WebDriverWait(mail, 10);
	
	
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 		
 			
 			String screenshotPath = SegmentsTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = SegmentsTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	
	}
	
	
	
	
	
	
	
	
	

}
