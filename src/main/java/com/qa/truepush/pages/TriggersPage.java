package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class TriggersPage extends TestBase{

	@FindBy(xpath = "//button[text() = \"Create Trigger\"]")

	WebElement createtrigger;
	

	@FindBy(css = "input[name=\"name\"]")

	WebElement triggername;
	
	

	@FindBy(css = "textarea[name=\"note\"]")

	WebElement triggernotes;
	
	

	@FindBy(css = "select[name=\"segments\"]")

	WebElement selectaudience;
	

	@FindBy(css = "select[name=\"templateId\"]")

	WebElement selecttemplate;
	
	
	

	@FindBy(xpath = "//label[text()  = \"Trigger Frequency\"]/following::label[1]")

	WebElement triggeronce;
	
	
	@FindBy(xpath = "//input[@name='onceTimeHour']")
	
	WebElement triggerhh;
	
	

	@FindBy(xpath ="//input[@name='onceTimeMinute']")
	
	WebElement triggermm;
	
	

	

	@FindBy(xpath = "//label[text()  = \"Trigger Frequency\"]/following::label[2]")

	WebElement triggerrepeat;
	

	@FindBy(css = "select[name=\"repeat\"]")
	
	WebElement selectcategory;
	

	@FindBy(xpath = "//input[@name='onceTimeHour']")
	
	WebElement triggerhours;
	
	

	@FindBy(xpath ="//input[@name='onceTimeMinute']")
	
	WebElement  triggerminutes;

	

	@FindBy(xpath = "//label[text()  = \"Trigger Frequency\"]/following::label[3]")

	WebElement triggermultipledates;
	

	@FindBy(xpath ="//input[starts-with(@name, \"mult\")]")
	
	WebElement selectmultipledates;
	
	
	
	@FindBy(xpath = "//button[@type='submit']")
	
	WebElement submitnotification;
	
	
	public TriggersPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
}

