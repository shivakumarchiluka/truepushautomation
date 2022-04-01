package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class DashboardPageTest  extends TestBase {
	
	
	  
		Loginpage LoginPage;
		
		ProjectPage projectpage;
		
		DashboardPage dashboardpage;
		

		public DashboardPageTest() {
			super();

		}
		
		
		@BeforeMethod
		
		public void setup() throws Exception {

			initialization();
					
			LoginPage = new Loginpage();
			
			projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
			
			 projectpage = new ProjectPage();
			 
			 dashboardpage = new DashboardPage();
			 
			dashboardpage =	projectpage.clickOnProjectlink();
			
			  Thread.sleep(2000);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterMethod
		
		public void teardown() {
			driver.close();
		}
}
