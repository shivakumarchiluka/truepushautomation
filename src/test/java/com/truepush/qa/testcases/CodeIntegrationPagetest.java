package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.CodeIntegraionPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class CodeIntegrationPagetest extends TestBase{
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	Maininterface maininterface;
	
	CodeIntegraionPage code;
	
	public CodeIntegrationPagetest() {
		
		super();
		
		
	}
	
	
	
	@BeforeMethod
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
 
		         projectpage.clickonproject();
		 
          maininterface = new Maininterface();
          
          code = maininterface.clickoncodeintegrationlink();
          
          code = new CodeIntegraionPage();
	
	
	}
	
	
	@Test
	
	public void validateCodeTest() {
		
		code.verifyScript();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	

}
