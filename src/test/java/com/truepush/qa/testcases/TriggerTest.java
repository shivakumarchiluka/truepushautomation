package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.TriggersPage;
import com.truepush.qa.testbase.TestBase;

public class TriggerTest extends TestBase{
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	DashboardPage dashboardpage;
	
	TriggersPage triggerspage;
	
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
		 
       
		 dashboardpage = new  DashboardPage();
		 
	}
		 
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
