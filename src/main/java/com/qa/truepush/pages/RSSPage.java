package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class RSSPage extends TestBase {

	@FindBy(xpath = "//h1[text()='New RSS Feed']")
	
	WebElement ADDNEWRSS;
	
	
	@FindBy(xpath = "//button[text()='New RSS Feed']")
	
	WebElement NewRSS;
	
	
	@FindBy(xpath = "//input[@name='rssname']")
	
	WebElement RSSName;
	
	
	@FindBy(xpath = "//input[@name='rsslink']")
	
	WebElement RSSLink;
	

	@FindBy(xpath= "//input[@name='scheduletime']")
	
	WebElement Delaynotification;
	
	
	@FindBy(xpath = "//select[@name='segments']")
	
	WebElement audience;
	
	
	@FindBy(xpath =" //select[@name='CampInterval']")
	
	WebElement campaignnterval;
	
	
	
	@FindBy(xpath = " //input[@maxvalue='672']")
	
	WebElement campaignexpirytime;
	
	
	
	@FindBy(xpath ="//button[@form='rssForm']")
	
	WebElement AddRSS;
	
	
	public RSSPage() {
		
		PageFactory.initElements(driver, this);
	}
	
}
