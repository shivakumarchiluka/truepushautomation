package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class NewProjectPage extends TestBase {
	

	@FindBy(xpath = "//input[@type='text']")
	
	WebElement projectname;
	
	
	@FindBy(xpath = "//img[@src='./assets/images/project_web.svg']")
	
	WebElement Webimg;
	
	
	@FindBy(xpath = "//button[text()='Configure Web']")
	
	WebElement configureweb;
	
	
	@FindBy(xpath = "//img[@src=\"./assets/images/project_wordpress.svg\"]")
	
	WebElement wordpressimg;
	
	
	@FindBy(xpath = "//button[text()='Configure Wordpress']")
	
	WebElement configurewordpress;
	
	
    @FindBy(xpath = "//img[@src=\"./assets/images/project_shopify.svg\"]")
	
	WebElement shopifyimg;
	
	
	@FindBy(xpath = "//button[text()='Configure Shopify']")
	
	WebElement configureshopify;
	
	
	
    public NewProjectPage() {
    	
    	
    	PageFactory.initElements(driver, this);
            }
	

	public void createNewProject(String name) {
		
		
		
		projectname.sendKeys(name);
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Webimg.click();
		
		try {
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		configureweb.click();
		
	}
	
	
}






