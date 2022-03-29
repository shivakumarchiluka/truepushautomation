package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.truepush.qa.testbase.TestBase;

public class PricingPage extends TestBase{

	@FindBy(xpath = "//span[text() = \" current project \"]")
	
	WebElement currentproject;
	
	

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
	
     }
