package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class CampaignPage extends TestBase {

	
          @FindBy(xpath="//button[text()='Create Campaign']")
           WebElement createcampaign;

          @FindBy(css="input[placeholder='(http(s)://www.example.com)']")
           WebElement Landingurl;

          @FindBy(css="input[name=title]")
	       WebElement title;
	
	
          @FindBy(css="textarea[name='body']")	
           WebElement message;

	
	      @FindBy(xpath="//button[text()=\"Send Notification \"]")
           WebElement sendnotification;
	
	
	      public CampaignPage() {
		
	     	PageFactory.initElements(driver, this);
	     	
	     	
	                            }
	
		  public void clickoncreatecampaign( String Enterurl, String Entertitle,   String Entermessage  ) {

			  
			  
			  createcampaign.click();
			  
			  Landingurl.sendKeys(Enterurl);
			  
				title.sendKeys( Entertitle);
				
				  message.sendKeys(Entermessage);
			


		           }

		public void ClickonSendnotification() {

			sendnotification.click();
		}
	
		  
		  

		  
		  
	}


	

	
	
	
	

