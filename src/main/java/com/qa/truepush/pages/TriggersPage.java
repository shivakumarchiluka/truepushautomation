package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	@FindBy(xpath = "//div[@class='table-responsive']/descendant::label[2]")
	
	WebElement activetrigger;
	
	
	@FindBy(xpath = "//div[@class='table-responsive']/descendant::button[1]")
	
	
	WebElement edittrigger;
	
	
	
	
	public TriggersPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	
	public void clickOnCreateTrigger() {
		
		createtrigger.click();
	}
	
	
	public void  addNewTrigger(String tgrnme ,String tgrnts,String temp) {
		
		triggername.sendKeys(tgrnme);
		
		triggernotes.sendKeys(tgrnts);
		
		Select select = new Select(selecttemplate);
		
		select.selectByVisibleText(temp);
		
		
	}
	
	public void sendttriggerrepeatedly(String catgy,String hh ,String mm) {
		
		
		triggerrepeat.click();
		
		Select select = new Select(selectcategory);
		
		select.selectByValue(catgy);
		
		triggerhours.sendKeys(hh);
		
		triggermm.sendKeys(mm);
		
		submitnotification.click();
	}
	
	public void editTrigger(String hrs ,String mns) {
		
		activetrigger.click();
		
		edittrigger.click();
		
		
		triggerhours.sendKeys(hrs);
		
		triggermm.sendKeys(mns);
		
		submitnotification.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




