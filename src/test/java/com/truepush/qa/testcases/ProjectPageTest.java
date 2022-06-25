package com.truepush.qa.testcases;

import org.testng.annotations.Test;



import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.relevantcodes.extentreports.LogStatus;
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
		
		test = report.startTest("validate Project Link Test");

		
		projectpage.clickOnProjectlink();
		
		
		System.out.println("project link has been clicked");
	}

/*	@Test(priority = 2)
	public void validateProject2LinkTest() {
		
		
		projectpage.clickOnProject2link();
		
		
		System.out.println("second project dashboard link has been clicked");
		
	}*/
	

	@Test(priority = 3)
	public void validateNewProjectTest() {
		
		test = report.startTest("validate New Project Test");

		
		projectpage.clickOnNewProjectButton();
		

		System.out.println("new project page link has been clicked");

	}


	@Test(priority = 2)
	public void validateUsersLinkTest() {
		
		test = report.startTest("validate Users Link Test");


		projectpage.clickOnUserslink();

		
		System.out.println("userspage link has been clicked");

	}

	
	@Test(priority = 4)
	
	public void validateSortBySubscriberButtonTest() {
		
		
		test = report.startTest("validate Sort By Subscriber Button Test");

		
		projectpage.verifySortBySubscribersButton();
		
	}
	
	
	
	@Test(priority = 5)
	
	public void validatePlatformTest() {
		
		test = report.startTest("validate Platform Test");

		
		projectpage.verifyPlatform();
		
	}
	
		
		
	@Test(priority = 6)
	
public	void validateCloneProjectTest() throws AWTException {
		
		test = report.startTest("validate Clone Project Test");

		
		projectpage.verifyCloneProject("clone", "luscious-hunts.000webhostapp.com/");
						

	}
	
	
	@Test(priority = 7)
	
	public void validateTokenInfoTest() {
		
		test = report.startTest("validate TokenInfo Test");

		
		projectpage.verifyTokenInfo();
		
	}
	
	
	
/*	@Test(priority = 9)
	
	void validateActiveButtonTest() {
		
		
		projectpage.verifyAccessButton();
		
	}*/
	
	
	@Test(priority = 8)
	
	void validateDeleteProjectTest() {
		
		test = report.startTest("validate Delete Project Test");
		
		projectpage.verifyDeleteProjectButton();
		
	}
	
	

	
	
	
	
	@AfterMethod
	
	
	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 		
 			
 			String screenshotPath = ProjectPageTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 			
 		}
 		
		else if(result.getStatus()==ITestResult.SKIP){
				
	 			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	 			
	 			test.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getThrowable());
	 			
	 			String screenshotPath = ProjectPageTest.getScreenshot(driver, result.getName());
	 			
	 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
	 			
		}
 			report.endTest(test);
 			
 			driver.close();
	}
}
