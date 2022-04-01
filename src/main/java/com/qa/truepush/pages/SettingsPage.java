package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class SettingsPage extends TestBase{

	
	
	@FindBy(xpath = "//td[text()='website']/following::button[3]")
	
	WebElement APIkey;
	
	

	@FindBy(xpath = "//td[text()='website']/following::button[4]")
	
	WebElement APPId;
	
	

	@FindBy(xpath = "//td[text()='website']/following::button[5]")
	
	WebElement RegenarateAPI;
	
	

	@FindBy(xpath = "//td[text()='website']/following::button[6]")
	
	WebElement Maximumnotifications;
	
	
	@FindBy(css = "input[inputmode = \"numeric\"]")
	
	WebElement numeric;
	
	
	@FindBy(xpath = "//button[text() = \"Update\"]")
	
	WebElement update;
	
	
	@FindBy(xpath = "//td[text()='website']/following::button[1]")
	
	WebElement Edit;
	
	
	@FindBy(xpath = "//td[text()='website']/following::button[2]")
	
	WebElement delete;

    
	
	@FindBy(xpath = "//input[@aria-label=\\\"Text input with dropdown button\\\"]")
	
	WebElement Enterwebsiteurl;
	
	
	
	@FindBy(xpath = "//a[text() = \"Read our documentation\"]")
	
	WebElement readdocumentation;
	
	
	
    @FindBy(css = "label[aria-label='Upload Product Icon']")

	WebElement producticon;
    
    
    @FindBy(css = "//input[@name = \"safari\"]/following::label[1]")
    
    WebElement EnableSafaribrowser;
    
	
	@FindBy(xpath = "//button[text()='Change Optin']")
	
	WebElement changeoptin;
	
	
	@FindBy(xpath = "//span[text()='Box']")//bell ,Optin-bar,default browser,cutom default+
	
	WebElement Optinstyle;
	
	
	@FindBy(xpath = "//button[text()='Choose This Style']")
	
	WebElement savethestyle;
	
	
	@FindBy(xpath = "//button[text()='Edit Content']")
	
	WebElement editcontent;
	
	
	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[1]")
	
	WebElement maintext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[2]")
	
	WebElement firstbuttontext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[3]")
	
	WebElement Subtext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[4]")
	
	WebElement secondbuttontext;
	
	
	@FindBy(xpath ="//button[text()='Save Content']")
	
	WebElement savecontent;
	
	
    @FindBy(xpath = "//button[text()='Reset To Default']")
	
	WebElement  resettodefault;
	
	
    @FindBy(xpath = "//input[@name='welcomeNotif']/following-sibling::label")
	
	WebElement welcomenotification;
	
	
	 @FindBy(xpath = "//h5[text()='Create Welcome Notification']/following::button[1]")
	
	WebElement  createwelcomenotification;
	
	
	
    @FindBy(xpath = "input[name='tempTitle']")
	
	WebElement entertitle;
	
	
    @FindBy(xpath = "textarea[name='message']")
	
	WebElement entermessage;
	
	
    @FindBy(xpath = "//span[text()='User Interaction Required']")

	WebElement useriinteraction;
	
	
	 @FindBy(xpath = "//button[text()='Save Notification']")
    
	WebElement savenotification;
	
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::button[1]")

	 WebElement Askoptinafter;
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::h6[3]") //default zero seconds
    
	 WebElement  fiveseconds;
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::button[2]")

   	WebElement optinfrequentshow;
	 
	 
	 @FindBy(xpath = "//a[text() = \"Read our documentation\"]/following::h6[7]") // default page refresh
	 
	 WebElement newsession;
	 
	 
	 @FindBy(css = "button[type = \"submit\"]")
	 
	 WebElement updateplatform;
	 
	 
	 
	 public SettingsPage() {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
}
