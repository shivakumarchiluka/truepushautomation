package com.truepush.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.PricingPage;
import com.qa.truepush.pages.ProjectPage;
import com.truepush.qa.testbase.TestBase;

public class PricingTest extends TestBase{
	
	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	PricingPage pricing;
	
	
	public PricingTest() {
		
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
         
         pricing = maininterface.clickonpricinglink();
    
          
         pricing = new PricingPage();
         
	}
    
	
		
		@Test
		
		public void validateCurrentProjectTest() {
			
		boolean flag =	pricing.CurrentProject();
		
		Assert.assertTrue(flag);
			
			
		}
		
		@Test
		
		public void validateCurrentProjectSubscribersTest() {
			
		boolean flag =	pricing.currentprojectSubscribers();
		
		Assert.assertTrue(flag);
			
			
		}
		
		
		
		   @Test
		   
		   public void validateCurrentProjectPricingTest() { 
			   
			 boolean flag =   pricing.currentProjectPricing();
			   
			   Assert.assertTrue(flag);
		   }
		
		
		
		
		
		   @Test
		   
		   public void validatePaymentTest() { 
			   
			   pricing.currentProjectPayment();
			   
			   
		   }

		
		
		@Test
		
		public void validateAllProjectTest() {
			
		boolean flag =	pricing.allProjects();
		
		Assert.assertTrue(flag);
			
			
		}
		

		   
		   
			@Test
			
			public void validateAllProjectSubscribersTest() {
				
			boolean flag =	pricing.allprojectsSubscribers();
			
			Assert.assertTrue(flag);
				
				
			}
			
			
			
			   @Test
			   
			   public void validateAllProjectPricingTest() { 
				   
				boolean flag =   pricing.allProjectsPricing();
				   
				   Assert.assertTrue(flag);
			   }
			   
			
			
			
			   @Test
			   
			   public void validatePaymentOverviewTest() { 
				   
				   pricing.allProjectsPayment();
				   
				   
			   }
			   
		   
		
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
		

	

}
