package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.UsersPage;
import com.truepush.qa.testbase.TestBase;

public class UsersTest extends TestBase{

	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	UsersPage userspage;
	
	public UsersTest() {
		
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setup() {

		initialization();
				 
		 loginpage = new Loginpage();		

		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
		 
		 userspage = projectpage.clickOnUserslink();
		 
		 userspage = new UsersPage();
		 
	   }
	
	
	
	    @Test
	    
	    public void validateAddNewUsersTest() {
	    	
	    	
	    	userspage.addNewUser("sahara", "waynews8899@gmail.com", "chiluka@19997");
	    	
	    	userspage.addNewUser();
	    	
	    }
	    
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
}
