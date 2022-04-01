package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class ProfilePage extends TestBase{

	@FindBy(xpath = "//a[@href=\"/profile\"]")
	
	WebElement profilelink;
	
	
	@FindBy(name = "Name")
	
	WebElement entername;
	
	
	@FindBy(xpath = "//span[contains(@class, \"checkbox\")]")
	
	WebElement updateyourpassword;
	
	
	@FindBy(name = "currentpassword")
	
	WebElement entercurrentpassword;
	
	
	@FindBy(name = "password1")
	
	WebElement enternewpassword;
	
	
	@FindBy(name = "password2")
	
	WebElement retypenewpassword;
	
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	
	WebElement updatepassword;
	
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	
	WebElement savechanges;
	
	
	@FindBy(css = "a[href=\"/bill\"]")
	
	WebElement billing;
	
	
	@FindBy(css = "//div[@class=\"container-fluid\"]/preceding::a[1]")
	
	WebElement logout;
	
	
	public ProfilePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
}
