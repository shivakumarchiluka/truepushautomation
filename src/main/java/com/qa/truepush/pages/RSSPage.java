package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class RSSPage extends TestBase {

		
	
	@FindBy(xpath = "//button[text()='Create RSS']")
	
	WebElement createRSS;
	
	
	
	@FindBy(xpath = "//button[text()='New RSS Feed']")  //after adding one RSS
	
	WebElement NewRSSFeed;
	

	
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
	
	
	
	//already added RSS feeds
	
	
	@FindBy(xpath = "//button[text()='New RSS Feed']/following::label[1]")
	
	WebElement label1;
	
	@FindBy(xpath = "//button[text()='New RSS Feed']/following::label[2]")

	WebElement label2;
	
	@FindBy(xpath = "//button[text()='New RSS Feed']/following::label[3]")

	WebElement label3;

	
	@FindBy(xpath = "//button[text()='New RSS Feed']/following::label[4]")

	WebElement label4;

	
	
	@FindBy(xpath = "//button[text()='New RSS Feed']/following::label[5]")

	WebElement label5;

	
	@FindBy(css = "a[aria-label='Next']")
	
	WebElement nextpage;
	
	
	
	
	public RSSPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void createrssfeedbutton() {
		
		createRSS.click();
		
	}
	
	public void createRss(String name ,String link, String string) {
				
		RSSName.sendKeys(name);
		
        RSSLink.sendKeys(link);
        
        Delaynotification.sendKeys(string);
		
		
	}
	
	
	public void clickOnAddNewRSSFeed(String RSSname ,String RSSlink ,CharSequence[] DelayNotification) {
		
		
		RSSName.sendKeys(RSSname);
		
		RSSLink.sendKeys(RSSlink);
		
		Delaynotification.sendKeys(DelayNotification);
		
		
	}
	

	
	public void clickAddRSS() {  ///submit RSS feed
		
		AddRSS.click();
		
	}
	
	
	public void addNewRSS() {  //adding next RSS 
		
		
		NewRSSFeed.click();
		
	}
	
	
	
	
	
	//CREATED RSS FEEDS
	
	
	public void clicklabel1Activebutton() {
		
		 label1.click();

	}

	
	public void clicklabel2Activebutton() {
		
	  label2.click();
			
	}
	
	
	public void clicklabel3Activebutton() {
		
		 label3.click();
			
	}
	
	
	public  void clicklabel4Activebutton() {
		
		 label4.click();
		
	}
	
	
	public void clicklabel5Activebutton() {
		
		 label5.click();
		
	} 
	
	
	public void clickOnNextPage() {
		
		nextpage.click();
		
	}
		
		
		
		
}
