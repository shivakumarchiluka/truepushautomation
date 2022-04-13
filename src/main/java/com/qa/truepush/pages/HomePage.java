package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class HomePage extends TestBase{
	
	
@FindBy(xpath = "//button[text()='Register']")

WebElement Registerbutton;





public  HomePage() {
	
	
PageFactory.initElements(driver,this);

}
	

public RegistrationPage clickOnRegister() {
	
	Registerbutton.click();

	return new RegistrationPage();
	
}




}
