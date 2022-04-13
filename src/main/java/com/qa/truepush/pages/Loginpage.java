package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class Loginpage extends TestBase{
	
 public Loginpage()  {
	 
		super();
			   
		   PageFactory.initElements(driver, this);
			   
		   }	
//this--pointing to current class object 
	//page factory or object repository
	
	
	@FindBy(name="email")
	WebElement Email;
	
	
	@FindBy(css="#fullname")
	WebElement Password;
	
	
	@FindBy(xpath="//h1[text()='Login to your Truepush account']/following::button[1]")
	WebElement LOGIN;
	
	@FindBy(xpath="//a[text()='Forgot Password']")
	WebElement Forgotpassword;
	
	@FindBy(css="#email")
	WebElement ForgetEmail;
	
	@FindBy(xpath="//button[text()='Send Verification Link']")
	WebElement SendMail;
	

	
	//Initializing the Page Objects:
	//actions
   
   public  ProjectPage Validatelogin(String us, String pass) {
	   
	   Email.sendKeys(us);
	   Password.sendKeys(pass);
	   LOGIN.click();
	   return new ProjectPage();
   }
   



	
}
   
   
	
	
	
	

