package com.truepush.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.NewProjectPage;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.RegistrationPage;
import com.qa.truepush.pages.SettingsPage;
import com.truepush.qa.testbase.TestBase;

public class NewProjectPageTest extends TestBase{

	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	NewProjectPage project;
	
    SettingsPage setting;	
	
	public NewProjectPageTest() {
		
		super();
		
	}
	
	
	

	@BeforeClass
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
	
		 project = projectpage.clickOnNewProjectButton();
		 
	        project = new NewProjectPage();
	
	}
	
	
	
	@Test(priority = 1)
	
	public void validateNewProjectTest() {
		
		
		project.createNewProject("shine");
		
	}
	
	
	@Test(priority = 2)
	
	
	public void validate() throws Exception{
		
		
		setting = new SettingsPage();
		
		setting.createNewProject("unstack-attacker.000webhostapp.com/", "welcome", "thank you for subscribing");
		
	}
	
	
	@Test(priority = 3)
	
	public void validateCodeIntegrationSetUpTEst() {
		
		RegistrationPage register = new RegistrationPage();
		
		register.clickOnCodeIntegrate();
		
		
	}
	
	
	
	
	
	
	@AfterClass
	
	public void teardown() {
		driver.close();
	}
	
	
	
}
