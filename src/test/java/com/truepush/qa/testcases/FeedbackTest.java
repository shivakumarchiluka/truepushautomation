package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.DashboardPage;
import com.qa.truepush.pages.FeedbackPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class FeedbackTest extends TestBase{
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	DashboardPage dashboardpage;
	
	FeedbackPage feedbackpage;
	
	public FeedbackTest() {
		
		super();
	
	}
	
	
	
	
	@BeforeMethod
	
	public void setup() {

		initialization();
				 
		 loginpage = new Loginpage();
		 
	projectpage =  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));

		 projectpage = new ProjectPage();

		 dashboardpage	=   projectpage.clickonproject();
		 		 
		 dashboardpage = new  DashboardPage();
		 
	      feedbackpage = new FeedbackPage();
		 
			dashboardpage.clickonfeedbacklink();


	}


	@Test
	
	public void verifyfeedbackform() {
		

		feedbackpage.feedbackForm("hello good morning", "have a nice day");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
		 
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
