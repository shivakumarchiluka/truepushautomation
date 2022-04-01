package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	WebElement useraccess;
	
     
     @FindBy(xpath = "//label[text()='User Access']/following::span[1]/following::li[1]")
     
     WebElement selectall;
	
	
    @FindBy(xpath = "//label[text()='User Access']/following::span[5]")
	
	WebElement viewaccess;
    
	
    @FindBy(xpath = "//label[text()='User Access']/following::span[1]/following::li[4]")
    
    WebElement selectmultiple;
    
    
    @FindBy(xpath = "//button[starts-with(text(),'Show')]")
	
	WebElement Informuser;
	
	
    
    
    public UsersPage() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    
    public void addNewUser(String usernme, String eml,String pass ) {
    	
    	username.sendKeys(usernme);
    	
    	email.sendKeys(eml);
    	
    	password.sendKeys(pass);
    }
    
    
    public void addNewUser() {
    	
    	
    	useraccess.click();
    	
    	selectall.click();
    	
    	viewaccess.click();
    	
    	selectmultiple.click();
    	
    	Informuser.click();
    	
    }
    
	
	
}
