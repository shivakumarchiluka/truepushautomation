package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class DashboardPage extends TestBase{

	
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
	
	WebElement profile;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[4]")
	
	WebElement menu;
	
	
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
    

    @FindBy(xpath = "//button[text()='Help Us Improve']")
    
    WebElement feedback;
    
    
    
	
	public DashboardPage() {
		
		
		PageFactory.initElements(driver, this);
		
                  	}
	
	public boolean truepushlogo() {
		
		
		 return Logo.isDisplayed();
		
                  	}
	
	public void clickonoptinguidelink() {
		
		
	 Optinguides.click();
		
                   	}
	
	public void clickonrefreshpage() {
		
		
		refreshdata.click();
		
	             }
	
	public boolean totalsummary() {
		
		
		
		return summary.isDisplayed();
	                }
	
	
	public boolean Weeklystats() {
		
		
		return weeklystats.isDisplayed();
	           }
	
	public boolean Last2dayastats() {
		
		
		return last2daysstats.isDisplayed();
		
              	}
	
	public boolean Lasrcampaigns() {
		
		
		return last5campaigns.isDisplayed();
		
               	}
	
	public void clickonallcampaignslink() {
		
		
		Viewallcampaigns.click();
		
		
               	}
	

	  public CampaignPage clickoncampaignlink(){
		  
		  campaignlink.click();
		
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
	  

		
	  public FeedbackPage clickonfeedbacklink() {
		  
		  
		  feedback.click();
		  
		  return new FeedbackPage();
		  
	  }	  
	  

		

	  
	  
	  
	  
	  
	  
	  
	
	
	
}
