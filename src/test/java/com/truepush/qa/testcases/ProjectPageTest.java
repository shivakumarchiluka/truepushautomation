package com.truepush.qa.testcases;

import org.testng.annotations.Test;


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
		//projectpage = LoginPage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
		 login("shiva.ch@truepush.com", "chiluka@1997");
		 projectpage = new ProjectPage();

	}

	@Test(priority = 1)
	public void VerifyprojectLink() {
		projectpage.clickOnProjectlink();
		System.out.println("project dashboard link has been clicked");
	}

	@Test(priority = 2)
	public void Verifyproject2link() {
		projectpage.clickOnProject2link();
		System.out.println("second project dashboard link has been clicked");
	}

	@Test(priority = 4)
	public void VerifyNewProject() {
		projectpage.clickOnNewProjectButton();

		System.out.println("new project page link has been clicked");

	}

	@Test(priority = 5)
	public void Verifyprofile() {

		projectpage.ClickOnprofilePage();

		System.out.println("Profilepage link has been clicked");

	}

	@Test(priority = 3)
	public void VerifyUsersLink() {

		projectpage.clickOnUserslink();

		System.out.println("userspage link has been clicked");

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
