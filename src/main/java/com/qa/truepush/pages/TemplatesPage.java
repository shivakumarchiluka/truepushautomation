package com.qa.truepush.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.truepush.qa.testbase.TestBase;

public class TemplatesPage extends TestBase{
	
	
	@FindBy(xpath = "//button[text() ='Create Template']")
	
	WebElement createtemplate;
	
	
	
	@FindBy(xpath = "//button[text()='New Template']")
	
	WebElement addnewtemplate;
	
	
	
	@FindBy(xpath = "//section[@class = \"preview-notification\"]/descendant::button[2]")
	
	WebElement windowsplatform;
	
	
	
	@FindBy(xpath = "//section[@class = \"preview-notification\"]/descendant::button[3]")
	
	WebElement appleplatform;
	
	
	
	@FindBy(xpath ="//label[text()='Template Name']/following-sibling::input")
	
	WebElement entertemplatename;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::input[1]")
	
	WebElement enterlandingpageurl;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::input[2]")
	
	WebElement entertitle;
	
	
	
	@FindBy(xpath = "//h4[text()='Notification Details']/following::textarea")
	
	WebElement entermessage;
	
	
	
	@FindBy(xpath = "//button[contains(text(),\"Create\")]")
	
	WebElement submittemplate;
	
	
	
    @FindBy(xpath = "//table[@class=\"table\"]/descendant::button[1]")
    
    WebElement edit;
	
    
    @FindBy(xpath = "//div[@class=\"container-fluid\"]/descendant::button[6]")
    
    WebElement updatetemplate;
    
	
	public TemplatesPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void createTemplate(String Templatename ,String LandingpageURL,String title,String message) {
		
		
		
		createtemplate.click();
		
		entertemplatename.sendKeys(Templatename);
		
		enterlandingpageurl.sendKeys(LandingpageURL);
		
		entertitle.sendKeys(title);
		
		entermessage.sendKeys(message);
		
		submittemplate.click();
		
		
	}
	
	
	public void createTemplateDTT(String TemplateName ,String LandingPageURL,String Title,String Message) {
		
		
		addnewtemplate.click();
		
	entertemplatename.sendKeys(TemplateName);
		
		enterlandingpageurl.sendKeys(LandingPageURL);
		
		entertitle.sendKeys(Title);
		
		entermessage.sendKeys(Message);
		
		submittemplate.click();
	
	}
	
	
	public void templateButton() {
		
		
WebDriverWait wait = new WebDriverWait(driver,10);
		
	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class=\"table\"]/descendant::button[1]")));
		
	
	ele.click();
		
	}
	
	
  public void editTemplate() {
	  
	/*WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable
				
				(By.xpath("//div[@class=\"container-fluid\"]/descendant::button[6]")));
				
					 ele.click(); 
*/
			
		updatetemplate.click();
	  
  }

}
