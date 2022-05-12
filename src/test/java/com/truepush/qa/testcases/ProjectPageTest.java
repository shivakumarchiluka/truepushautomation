package com.truepush.qa.testcases;

import org.testng.annotations.Test;


import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class ProjectPageTest extends TestBase {

	Loginpage LoginPage;
	
	
	ProjectPage projectpage;
	

	public ProjectPageTest() {
		
		super();

	}
	

	@BeforeMethod
	public void setup() throws Exception {

		initialization();
		
		LoginPage = new Loginpage();
		
		projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
		
       // login("shiva.ch@truepush.com", "chiluka@1997");
		 
		 projectpage = new ProjectPage();

	}

	@Test(priority = 1)
	public void validateProjectLinkTest() {
		
		
		projectpage.clickOnProjectlink();
		
		
		System.out.println("project dashboard link has been clicked");
	}

/*	@Test(priority = 2)
	public void validateProject2LinkTest() {
		
		
		projectpage.clickOnProject2link();
		
		
		System.out.println("second project dashboard link has been clicked");
		
	}*/
	

	@Test(priority = 3)
	public void validateNewProjectTest() {
		
		
		projectpage.clickOnNewProjectButton();
		

		System.out.println("new project page link has been clicked");

	}


	@Test(priority = 2)
	public void validateUsersLinkTest() {
		

		projectpage.clickOnUserslink();

		
		System.out.println("userspage link has been clicked");

	}

	
	@Test(priority = 4)
	
	public void validateSortBySubscriberButtonTest() {
		
		projectpage.verifySortBySubscribersButton();
		
	}
	
	
	
	@Test(priority = 5)
	
	public void validatePlatformTest() {
		
		projectpage.verifyPlatform();
		
	}
	
		
		
	@Test(priority = 6)
	
public	void validateCloneProjectTest() throws AWTException {
		
		projectpage.verifyCloneProject("clone", "luscious-hunts.000webhostapp.com/");
						

	}
	
	
	@Test(priority = 7)
	
	public void validateTokenInfoTest() {
		
		projectpage.verifyTokenInfo();
		
	}
	
	
	
/*	@Test(priority = 9)
	
	void validateActiveButtonTest() {
		
		
		projectpage.verifyAccessButton();
		
	}*/
	
	
	@Test(priority = 8)
	
	void validateDeleteProjectTest() {
		
		
		projectpage.verifyDeleteProjectButton();
		
	}
	
	

	
	
	
	
	@AfterMethod
	
	public void teardown() {
		
		driver.close();
	}
}
