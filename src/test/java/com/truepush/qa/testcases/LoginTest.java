package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class LoginTest extends TestBase {

	ProjectPage projectpage;
	
	Loginpage  login;
	
	public LoginTest() {
		
		super();
		
	}
	
	//initialization();is called from the parent class or base class

	
	 @BeforeMethod
	 public void setUP() {
		 
		 initialization();
		 
       login = new Loginpage();
	 }
	
	 
	 @Test
	 public void ValidateLogin() {
		 
		projectpage = login.Validatelogin(prop.getProperty("email"),prop.getProperty("password"));
		
		System.out.println("successfully logined into the truepush account");
	 }
	 
	 
	 
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
