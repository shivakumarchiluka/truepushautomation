package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.SegmentsPage;
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
 
		         projectpage.clickonproject();
		 
          maininterface = new Maininterface();
	
	           segment = maininterface.clickonsegmentslink();
	           
	           segment = new SegmentsPage();
	}
	
	
	
	
	
	@Test(priority = 1)
	
	public void validateSegmentCreationTest() {
		
		
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
		
		segment.createSegmentDDT(SegmentName, SegmentNotes);
		
	} 
		
		
		@Test(priority = 3)
		
		public void validateSegmentEditFeatureTest() {
		
			
		segment.editSegment("TS PARTY");
		
		segment.editsegment();
		
		
	}
	
	
	//WebDriverWait wait = new WebDriverWait(mail, 10);
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
