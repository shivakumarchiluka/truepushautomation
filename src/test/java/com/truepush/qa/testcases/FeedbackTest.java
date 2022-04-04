package com.truepush.qa.testcases;



import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.FeedbackPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class FeedbackTest extends TestBase{
	
	


	Loginpage loginpage;

	ProjectPage projectpage;
	
	
	
    Maininterface maininterface;	
    
    
    
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

		  projectpage.clickOnProjectlink();
		 		 
         maininterface = new Maininterface();	      
	      
	   maininterface.clickonfeedbacklink();
	      
	   
	   feedbackpage = new FeedbackPage();
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
