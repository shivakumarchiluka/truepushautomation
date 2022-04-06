package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class PricingPage extends TestBase{

	@FindBy(xpath = "//span[text() = \" current project \"]")
	
	WebElement currentproject;
	
	
	
	@FindBy(xpath = "//span[text() = \" current project \"]/following::h6[1]")
	
	WebElement currentprojectsubscribers;
	
	
	
	@FindBy(xpath = "//span[text() = \" current project \"]/following::h6[2]")
	
	WebElement currentprojectpricing;
	
	
	
	@FindBy(xpath = "//span[text() = \" current project \"]/following::h6[3]")
	
	WebElement allprojectssubscribers;
	
	
	
	@FindBy(xpath = "//span[text() = \" current project \"]/following::h6[4]")
	
	WebElement allprojectspricing;
	
	
	

	@FindBy(xpath = "//span[text() = \" current project \"]/following::button[1]")
	
	WebElement  payment;
	

	
	@FindBy(xpath = "//span[text() = \" All Projects \"]")
	
	WebElement allprojects;
	
	

    @FindBy(xpath = "//span[text() = \" current project \"]/following::button[2]")
	
	WebElement paymentoverview;
    
	
	
	@FindBy(xpath = "//h3[text() = \"Support\"]")

    WebElement support;



     @FindBy(xpath = "//span[text() = \" current project \"]/following::button[3]")

     WebElement chatwithus;
	
     
     @FindBy(xpath = "//button[starts-with(text(),\"Payment\")]")
     
     WebElement paymenthistory;
     
     
     public PricingPage() {
    	 
    	 PageFactory.initElements(driver, this);
     }
     
     
     public boolean CurrentProject() {
    	 
    	 
         return  currentproject.isDisplayed();
    	 
    	
     }
     
     
     public boolean currentprojectSubscribers() {
    	 
    	 
    	return currentprojectsubscribers.isDisplayed();

    	 
    	 
     }
     
     
     public boolean currentProjectPricing() {
    	 
    	 
    	    return  currentprojectpricing.isDisplayed();

    	 
    	 
     }
     
     
     public void currentProjectPayment() {
    	 
    	 payment.click();
    	 
    	 paymenthistory.click();
    	 
    	 
     }
     
     
     public boolean allProjects() {
    	 
    	 
         return  allprojects.isDisplayed();
    	 
    	
     }
     
     
     
     public boolean allprojectsSubscribers() {
    	 
    	 
    	return allprojectssubscribers.isDisplayed();
    	 
    	 
    	 
     }
     
   
     
     public boolean allProjectsPricing() {
    	 
    	 
    return  allprojectspricing.isDisplayed();
    	 
    	 
     }
     

     
     
   public void allProjectsPayment() {
    	 
    	 paymentoverview.click();
    	 
    	 paymenthistory.click();
    	 
     }
     
     
     
     
     
     
     }
