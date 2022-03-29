package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class SubscribersPage extends TestBase{

	
	@FindBy(xpath = "//div[@class='tabs-body']/descendant::a[8]")
	
	WebElement nextpagesubscribers;
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[2]")
	
	WebElement categorywisestats;
	
	
	@FindBy(xpath = "//div[@class='main-wrapper']/descendant::a[29]")
	
	WebElement platformwisenextpage;
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[3]")
	
	WebElement subscribers;
	
	
	@FindBy(css = "input[name=\"subId\"]")
	
	WebElement searchsubscriberusingId;
	
	
	
	@FindBy(css = "input[name=\"selectedDate\"]")
	
	WebElement daterange;
	
	
	
	@FindBy(xpath = "//select[@name='recordsPerPage']")
	
	WebElement status; // all, active ,inactive
	
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[4]")
	
	WebElement testusers;
	
	
	public SubscribersPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
}
