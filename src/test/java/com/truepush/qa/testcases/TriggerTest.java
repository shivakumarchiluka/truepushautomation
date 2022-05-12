package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.TriggersPage;
import com.truepush.qa.testbase.TestBase;
import com.truepush.qa.utilities.Testut;

public class TriggerTest extends TestBase{
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	TriggersPage trigger;
	
	 String sheetName = "sheet1";
	 
	 String SheetName = "sheet2";

	
	public TriggerTest() {
		
		super();
	
	}
	
	
	
	
	@BeforeMethod
	
	public void setup() {     

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickOnProjectlink();
		
         maininterface = new Maininterface();

		 
			trigger = maininterface.clickontriggerslink();

		 trigger = new TriggersPage();
       
		 
	}
	
	
	@Test (priority = 1)
	
	public void createTriggerTest() {
		
 
		trigger.CreateTrigger("w3schools", "programming languages");
		
		trigger.sendttriggerrepeatedly("10", "37");
		
	}
	
	@DataProvider
	public Object[][] triggertestdata() {
		
		Object data[][]=Testut.getTriggerTestData(sheetName);
		
		return data;
	}
	
	@Test( priority = 2,dataProvider = "triggertestdata")
	
	public void createTriggerDDTTest(String TriggerName ,String TriggerNotes,String HH , String MM) {
		
		trigger.createTriggerDDT(TriggerName, TriggerNotes, HH, MM);
		
	}
		

	
	
		@Test
	
	public void editTriggerTest() {
		
		trigger.editTrigger("11", "09");		
		
	} 
	
	
	
		 
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
