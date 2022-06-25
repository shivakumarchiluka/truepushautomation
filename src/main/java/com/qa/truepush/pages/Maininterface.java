package com.qa.truepush.pages;


import java.util.Iterator;

import java.util.Set;

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
	
	
	@FindBy(xpath = "//ul[@class = \"ng-star-inserted\"]/descendant::a[2]")
	
	WebElement clickonproject;
	
	
	@FindBy(css = "button[title=\"Create New Project\"]")
	
	WebElement createnewproject;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[2]")
	
	WebElement createcampaign;
	
	
	@FindBy(xpath = "//div[@class=\"project-dropdown\"]/following::button[3]")
	
	WebElement profiletoproject;
	
	
	@FindBy(xpath = "//div[contains(@class, \"status \")]")
	
	WebElement freelogo;
	

    @FindBy(xpath = "//nav[@class='main-nav']/child::a[2]")
    
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
    
    
    
	@FindBy(xpath="//button[@class=\"profile-icon\"]")
	
	WebElement  profileicon;
	
	
	@FindBy(xpath = "//button[@class =\"profile-icon\"]/following::a[1]")
	
	
	WebElement userprofile;
	
	
	@FindBy(name = "Name")
	
	
	WebElement entername;
	
	
	@FindBy(xpath = "//span[contains(@class, \"checkbox\")]")
	
	
	WebElement updatepassword;
	
	
	@FindBy(name = "currentpassword")
	
	
	WebElement currentpassword;
	
	
	
	@FindBy(name = "password1")
	
	
	WebElement newpassword;
	
	
	@FindBy(name = "password2")
	
	
	WebElement retypenewpassword;
	
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	
	
	WebElement savechanges;
	
	
	@FindBy(css = "a[href=\"/bill\"]")
	
	
	WebElement billing;
	
	
	@FindBy(xpath = "//div[@class=\"container-fluid\"]/preceding::a[1]")
	
	
	WebElement logout;
	
	
	@FindBy(id = "driftChat")
	
	
	WebElement chatbutton;

	
	
    
    public Maininterface() {
    	
    	PageFactory.initElements(driver, this);
    	
    }
    
	
    
	
	
	public String validatePageTilte() {
		
		return driver.getTitle();
		
		
	}
	
	public boolean truepushlogo() {
		
		
		 return Logo.isDisplayed();
		 
		
                  	}
	

	  public CampaignPage clickoncampaignlink() throws Throwable{
		  
	/*	 WebDriverWait wait = new WebDriverWait(driver,10);
		  
		WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@class='main-nav']/child::a[2]")));
		
		ele.click(); */
     
		  Thread.sleep(2000);
		  
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
	  

		
	    public  FeedbackPage clickonfeedbacklink() {
	    	
		  
     WebDriverWait wait = new WebDriverWait(driver,10);
	
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text() =\"Feedback\"]"))).click();

		    return new FeedbackPage();
		  
	  }	  
	  

		
	public boolean verifyStatusOfProject() {
		
		
	return	freelogo.isDisplayed();
		
	}

	
	public void verifyCampaignButton() {
		
		
		createcampaign.click();
		
		
	}
	
	
	public void verifyProfileIcon(String profilename,String currentpas,String newpass) {
		
		profileicon.click();
		
		userprofile.click();
		
		entername.clear();
		
		entername.sendKeys(profilename);
		
		updatepassword.click();
		
		currentpassword.sendKeys(currentpas);
		
		newpassword.sendKeys(newpass);
		
		retypenewpassword.sendKeys(newpass);
		
		savechanges.click();
		
	}
	
	public void verfiyProfileIcon() {
		
		profileicon.click();
		
		billing.click();
		
		
		
	}
	
	
	
	public void verifyLogoutIcon() {
		
		profileicon.click();

		
		logout.click();
		
	}
	
	
	
	public void verfiyDriftChat() throws Exception {
		
		chatbutton.click();
		
		
        Set<String> windowhandles = driver.getWindowHandles();
        
        
		System.out.print(windowhandles);
		
		
	    Iterator<String>iterator = windowhandles.iterator();
	    
	    
	    String parentwindow = iterator.next();
	    
	    System.out.println(parentwindow);
	    
	    String childwindow = iterator.next();
	    
	    
	    driver.switchTo().window(childwindow);
	    
	    	Thread.sleep(2000); 
	    	
	    	driver.close();	  
	    	
		driver.switchTo().window(parentwindow);
		


	}
	
		
		
		public ProjectPage verfiyMenuButton() {
			
			profiletoproject.click();
			
			return new ProjectPage();
			
	}
		
		
		public void verifySwichToProject(String name) {
			
			switchtoanotherproject.click();
			
		//	searchproject.sendKeys(name);
			
		//	clickonproject.click();
			
			createnewproject.click();
		}
		
		
	
	
}
