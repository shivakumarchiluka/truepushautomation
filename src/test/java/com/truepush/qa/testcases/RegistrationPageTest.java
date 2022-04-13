package com.truepush.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.truepush.pages.HomePage;
import com.qa.truepush.pages.RegistrationPage;
import com.qa.truepush.pages.SettingsPage;
import com.truepush.qa.testbase.TestBase;

public class RegistrationPageTest extends TestBase {
	
    HomePage homepage;

	RegistrationPage register;
	
	SettingsPage settings;
	
	public 	RegistrationPageTest() {
		
		
		super();
		
	}
	
	
	
	
	@BeforeClass
	
	public void setup(){

		initialize();

		homepage = new HomePage();
		
		register = homepage.clickOnRegister();
		
		register = new RegistrationPage();
		
	
     	}
	
	
	
	@Test(priority = 1)
	
	public void validateRegistration() {
		
		
  register.verifyRegistration("airindia", "bhagirathiriver@outlook.com", "chiluka@1997");	
  
  
	}
	
	
	
	
	@Test(priority = 2)
	
	public void validateNewProject() throws Exception {
		
		Thread.sleep(2000);
		
		register.createNewProject("bluesky");
		
		settings = new SettingsPage();

		settings.createNewProject("luscious-hunts.000webhostapp.com/", "welcome", "thank you subscribing");
		
		register.clickOnCodeIntegrate();
	}
	
	
	
	
	
    @AfterClass
    
    public void teardown() {
   	 
   	 driver.close();
   	 
   	 
    }

}
