package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class TemplatesPage extends TestBase{
	
	
	@FindBy(xpath = "//button[text() ='Create Template']")
	
	WebElement createtemplate;
	
	
	
	@FindBy(xpath = "//button[text()='New Template']")
	
	WebElement addnewtemplate;
	
	
	@FindBy(xpath = "//section[@class = \"preview-notification\"]/descendant::button[2]")
	
	WebElement windowsplatform;
	
	
	@FindBy(xpath = "//section[@class = \"preview-notification\"]/descendant::button[3]")
	
	WebElement appleplatform;
	
	@FindBy(xpath ="//label[text()='Template Name']/following-sibling::input")
	
	WebElement entertemplatename;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::input[1]")
	
	WebElement enterlandingpageurl;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::input[2]")
	
	WebElement entertitle;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::textarea")
	
	WebElement entermessage;
	
	
	
	@FindBy(xpath = "\"//button[text()='Create Template']\"")
	
	WebElement submittemplate;
	
	
	public TemplatesPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	

}
