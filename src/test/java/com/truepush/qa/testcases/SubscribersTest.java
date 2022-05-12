package com.truepush.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.SubscribersPage;
import com.truepush.qa.testbase.TestBase;

import junit.framework.Assert;

public class SubscribersTest extends TestBase{
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	SubscribersPage subscriber;
	
	
	public SubscribersTest() {
		
		
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
         
         subscriber = maininterface.clickonsubscriberslink();
         
         subscriber = new   SubscribersPage();
         
	}

	
	
	@Test(priority = 1)
	
	public void validateCategoryWiseStatsTest() {
		
		subscriber.verifyCategoryWiseStats();
		
	}	
	
	
	@Test(priority = 2)
	public void validateBrowsersWiseSubscribersTest() {
		
	boolean flag =	subscriber.verifyBrowsersWiseSubscribers();
	
    Assert.assertTrue(flag);	
    
	}
	
	
	@Test(priority = 3)
	
	public void validatePlatformWiseSubscribersTest() {
		
	boolean flag =	subscriber.verifyPlatformWiseSubscribers();
	
    Assert.assertTrue(flag);	
	}
	
	
	@Test(priority = 4)
	
	public void validateCountryWiseSubscribersTest() {
		
		
	boolean flag =	subscriber.verifyCountryWiseSubscribers();
	
    Assert.assertTrue(flag);
    
	}
	

	
	@Test(priority = 5)
	
	public void  validateSubscribersIdTest() throws AWTException {
		
		subscriber.verifySubscribersUsingID("6221a71b75c57caca84c410");
		
	}
	
	
	@Test(priority = 6)

	 public void validateSubscribersDateRangeTest() throws AWTException {
	
       subscriber.verifySubscribersUsingDate("2022/2/17 - 2022/3/8");		
	}

	
	@Test(priority = 7)
	
	 public void validateSubscribersStatusTest() {
		
		subscriber.verifySubscribersStatus();
		
	}

	@Test(priority = 8)

	public void validateTestUsersTest() {
		
		subscriber.verifyTestUsers();
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
@AfterMethod
public void teardown() {

	driver.close();
}
}
