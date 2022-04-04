package com.qa.truepush.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.truepush.qa.testbase.TestBase;

public class Maininterface extends TestBase {
	
	
	
	@FindBy(xpath = "//img[@alt=\"Truepush logo\"]")
	
	WebElement Logo;
	
	@FindBy(css = ".btn-icon")
	
	WebElement switchtoanotherproject;
	
	
	@FindBy(css = "input[placeholder = \"Search Project\"]")
	
	WebElement searchproject;
	
	
	@FindBy(css = "button[title=\"Create New Project\"]")
	
	WebElement createnewproject;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[1]")
	
	WebElement createcampaign;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[3]")
	
	WebElement profileicon;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[4]")
	
	WebElement menu;
	
	@FindBy(xpath = "//div[contains(@class, \"status \")]")
	
	WebElement freelogo;
	

    @FindBy(xpath="//nav[@class='main-nav']/child::a[2]")
     WebElement campaignlink;
	
	

    @FindBy(xpath="//nav[@class='main-nav']/child::a[3]")
     WebElement rss;

    
    @FindBy(xpath="//nav[@class='main-nav']/child::a[5]")
     WebElement segments;
    
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[6]")
     WebElement templates;
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[7]")
     WebElement triggers;
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[9]")
     WebElement subscribers;
    
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[10]")
     WebElement codeintegration;
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[11]")
     WebElement settings;
    

    @FindBy(xpath="//nav[@class='main-nav']/child::a[13]")
     WebElement pricing;
    

    
    @FindBy(xpath = "//h6[text() =\"Feedback\"]")
    
    public  static  WebElement  feedback;

    
    public Maininterface() {
    	
    	PageFactory.initElements(driver, this);
    	
    }
    
	
    
	
	
	public String validatePageTilte() {
		
		return driver.getTitle();
		
	}
	
	public boolean truepushlogo() {
		
		
		 return Logo.isDisplayed();
		
                  	}
	

	  public CampaignPage clickoncampaignlink(){
		  
	
		
		  return new CampaignPage();
		  
          	}
	
	
	  public RSSPage clickonrsslink() {
		  
		  rss.click();
		  
		  return new RSSPage();
	  }	  
	  
	    

		
	  public SegmentsPage clickonsegmentslink() {
		  
		  segments.click();
		  
		  return new SegmentsPage();
	  }	  
	  

		
	  public TemplatesPage clickontemplateslink() {
		  
		  templates.click();
		  
		  return new TemplatesPage();
	  }	  
	  

		
	  public TriggersPage clickontriggerslink() {
		  
		  triggers.click();
		  
		  return new TriggersPage();
	  }	  
	  

		
	  public SubscribersPage clickonsubscriberslink() {
		  
		  subscribers.click();
		  
		  return new SubscribersPage();
		  
	  }	  
	  

		
	  public CodeIntegraionPage clickoncodeintegrationlink() {
		  
		  
		  codeintegration.click();
		  
		  return new CodeIntegraionPage();
		  
	  }	  
	  

		
	  public SettingsPage clickonsettingslink() {
		  
		  
		  settings.click();
		  
		  return new SettingsPage();
		  
	  }	  
	  

		
	  public PricingPage clickonpricinglink() {
		  
		  
		  pricing.click();
		  
		  return new PricingPage();
		  
		  
	  }	  
	  

		
	    public  FeedbackPage clickonfeedbacklink() {
	    	
		  
		 WebDriverWait wait = new WebDriverWait(driver,10);
	
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text() =\"Feedback\"]"))).click();

		    return new FeedbackPage();
		  
	  }	  
	  
   public ProfilePage clickonprofileicon() {
  	 
  	 profileicon.click();
  	
  	 return new ProfilePage();
   }
		
	

}
