package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.truepush.qa.testbase.TestBase;

public class UsersPage extends TestBase{

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	
	WebElement cleardata;
	
	
	@FindBy(xpath = "//input[@placeholder='User Name']")
	
	WebElement username;
	
	
	
    @FindBy(css = "input[name='email']")
	
	WebElement email;
    
	
    @FindBy(css = "#inlineFormInputGroup")
	
	WebElement  password;
	
	
     @FindBy(xpath = "//label[text()='User Access']/following::span[1]")
	WebElement useracess;
	
	
	
    @FindBy(xpath = "//label[text()='User Access']/following::span[5]")
	
	WebElement viewaccess;
	
	
    @FindBy(xpath = "//button[starts-with(text(),'Show')]")
	
	WebElement Informuser;
	
	
    
    
    
    
    
    
    
	
	
}
