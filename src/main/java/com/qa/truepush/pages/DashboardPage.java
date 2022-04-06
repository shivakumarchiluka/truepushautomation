package com.qa.truepush.pages;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class DashboardPage extends TestBase{

	
	
	
	@FindBy(xpath = "//strong[text()='Opt-in Guides']/parent::button")
	
	WebElement Optinguides;
	
	
	@FindBy(xpath = "//button[@title='Refresh data']")
	
	WebElement refreshdata;
	
	
	@FindBy(xpath="//h2[text()='Total Summary']")
	
	WebElement summary;
	
	
	
	@FindBy(xpath="//h3[text()='Weekly Stats']")

	WebElement weeklystats;
	
	
	
	@FindBy(xpath="//h3[contains(text(),'Last 2')]")

	WebElement last2daysstats;
	
	
	
	@FindBy(xpath="//h3[contains(text(),'Last 5')]")

	WebElement last5campaigns;
	
	
	
	@FindBy(xpath="//button[starts-with(text(),'View')]")

	WebElement Viewallcampaigns;
	


    
    
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
		
                  	}
	

	
	public void clickonoptinguidelink() {
		
		
	 Optinguides.click();
	 
        	}
	
	
	public void clickonrefreshicon() {
		
		
		refreshdata.click();
		
	       }
	
	public boolean totalsummary() {
		
		
		return summary.isDisplayed();
		
           }
	
	
	public boolean Weeklystats() {
		
		
		return weeklystats.isDisplayed();
		
	       }
	
	
	public boolean Last2daysstats() {
		
		
		return last2daysstats.isDisplayed();
		
        	}
	
	
	public boolean Lastcampaigns() {
		
		
		return last5campaigns.isDisplayed();
		
          	}
	
	
	public void clickonallcampaignslink() {
		
		
		Viewallcampaigns.click();
		
		
         	}

	  
	  
	
	
	
}
