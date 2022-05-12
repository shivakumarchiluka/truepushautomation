   package com.qa.truepush.pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;
   import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.truepush.qa.testbase.TestBase;


    public class RegistrationPage extends TestBase {

	@FindBy(xpath = "//a[@routerlink='/home/register']")
	
	WebElement registerlink;
	
	@FindBy(id = "name")
	
	 WebElement Name;
	
	
	@FindBy(id = "email")
	
	
	 WebElement Email;
	
	 
	 @FindBy(id = "password")
		
	 
	 WebElement Password;
		
		 
   	@FindBy(xpath = "//input[@type='checkbox']/following::span[1]")
   	
   	WebElement checkbox;
   	
   	
   	@FindBy(xpath = "//button[text()='Register']")

   	WebElement Registerbutton;
   	
   	
   	@FindBy(xpath = "//input[@type='text']")
   	
   	WebElement enterprojectname;
   	
   	
   	@FindBy(xpath = "//img[@src='./assets/images/project_web.svg']")
   	
   	WebElement  webimage;
   	
   	
   	@FindBy(xpath = "//button[text()='Configure Web']")
   	
   	WebElement  configureweb;
   	

   	@FindBy(xpath = "//span[text()=\"Code Integration\"]")
   	
   	WebElement codeintegrate;
   	
   	
   	@FindBy(xpath = "//button[text()='Setup Completed']")
   	
   	WebElement setup;
   	
   	@FindBy(xpath = "//button[@class = \"is-close h-auto\"]")
   	
   	WebElement close;
   	
	
	public  RegistrationPage() {
		
		
	PageFactory.initElements(driver,this);
	
	}

	
	
 
	public void verifyRegistration(String name, String email,String password) {	
		
		
        Set<String> windowhandles = driver.getWindowHandles();
        
        
		System.out.print(windowhandles);
		
	    Iterator<String>iterator = windowhandles.iterator();
	    
	    
	    String parentwindow = iterator.next();
	    
	    
	    System.out.print(parentwindow);
	    
	    
	    String childwindow = iterator.next();
	    
	    
	    driver.switchTo().window(childwindow);	

	    
		Name.sendKeys(name);
		
		
		Email.sendKeys(email);
		
		
		Password.sendKeys(password);
		
		
		checkbox.click();
		
		
		Registerbutton.click();
		
        
	//	driver.switchTo().window(parentwindow);
		
	}
	
	public void createNewProject(String name) {
		
		
		
		enterprojectname.sendKeys(name);
		
		webimage.click();
		
		configureweb.click();
		
		
	}
	
	public void clickOnCodeIntegrate() {
		
		
		codeintegrate.click();
		
		
    	JavascriptExecutor jsscript = (JavascriptExecutor)driver;
    	

    	jsscript.executeScript("window.scrollTo(0,1500)");
    	
		
		setup.click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = \"is-close h-auto\"]")));
				
		ele.click();
		
	}
	

	
	
}
