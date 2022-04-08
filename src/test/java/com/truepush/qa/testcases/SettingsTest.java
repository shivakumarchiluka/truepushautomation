package com.truepush.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.SettingsPage;
import com.truepush.qa.testbase.TestBase;

public class SettingsTest extends TestBase {
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	SettingsPage settings;
	
	
	public SettingsTest() {
		
		super();
	
	}
	
	
	
	@BeforeMethod
	
	public void setup() {

		initialization();
				 
		 loginpage = new Loginpage();		

		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();

		 projectpage.clickonproject();
		
         maininterface = new Maininterface();
       
         settings = maininterface.clickonsettingslink();
         
         settings = new SettingsPage();
	}
	


	
	@Test(priority = 8)
	
	public void validateRestAPIKeyTest() {
		
		
	boolean flag = 	settings.verifyRestApiKey();
		
		Assert.assertTrue(flag);
		
	}
	
	
     @Test(priority = 9)
	
	public void validateAPPIdTest() {
		
		
	boolean flag = 	settings.verifyAPPId();
		
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority = 3)
	public void validateProjecticonTest() throws Exception {
		
		
		settings.verifyProjectIcon();
		
	}
	
	
	@Test(priority = 2)
	
	public void validateDocumentationLinkTest() {
		
		
		settings.verifyDocumentationLink();
		
		
	}
	
	@Test(priority = 1)
		
	public void validateSettingsPageTest() {
		
		settings.editSettings("tinnier-chests.000webhostapp.com/");
		
	}
	

	
	@Test(priority = 4)
	
	public void validateOptinStyleTest() {
		
		settings.verifyEditOptinStyle();
		
	}
	
	
	@Test(priority = 5)
	public void validateOptinContentTest() {
		
		
		settings.verifyOptinContent("Allow updates from truepush", "You can turn it off whenever you require",
				"never", "allow now");
		
	}

	@Test(priority = 7)
	public void validateWelcomenotificationTest() {
		
		
	settings.verifyWelcomeNotification("welcome", "thank you for subscribing");	
		
		
		
	}
	

     @Test(priority = 10)
     
     public void validateMaxmimumNotificaionsInputBoxTest() {
    	 
    	 
    	 settings.verifyMaxmimumNotificaionsInputBox("3");
    	 
    	 
     }
	

	@Test(priority = 11)
	
	public void validateRegnerateTokenTest() {
		
		settings.verifyRegenerateToken();
		
	}
	
	




      @Test(priority = 6)
      public void validateDefaultSettingsTest() {
	
	
	settings.verifyDefaultSettings();
	
          }

      
      @Test
      
      public void validateGDPRTest() {
    	  
    	  settings.verifyGDPRLink();
    	  
      }

	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	

   }
