package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.TemplatesPage;
import com.truepush.qa.testbase.TestBase;

public class TemplateTest  extends TestBase {

	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	
	TemplatesPage template;
	
	
	String sheetName = "sheet1";
	
	
	
	public TemplateTest() {
		
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
          
      template =  maininterface.clickontemplateslink();
          
         template = new TemplatesPage(); 
         
	}
	
	
	@Test(priority = 1)
	
	public void validateTemplateCreationTest() {
		
		template.createTemplate("w3schools", "https://w3schools.com", "programming languages",
				
				"learn full stack development,testing,frameworks etc");
		
	}  
	

	
	@Test(priority = 2)
	
	public void validateTemplate2Test() {
		
		template.createTemplateDTT();
		
		template.createTemplate("jiomart", "https://jiomart.com", "order groceries,essentials etc", 
				"avail the free home delivery service");
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
