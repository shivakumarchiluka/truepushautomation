package com.qa.truepush.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class Wordpresspage extends TestBase {

	
	@FindBy(css = "input[id=user_login]")
	
	WebElement username;
	
	
	@FindBy(id = "user_pass")
	
	WebElement password;
	
	
	@FindBy(css = "input[class='button button-primary button-large']")
	
	WebElement login;
	
	
	@FindBy(xpath = "//div[text()='Posts']")
	
	WebElement posts;
	
	
	@FindBy(xpath = "//div[text()='Posts']/following::a[2]")
	
	WebElement addnew;
	
	
	@FindBy(xpath = "//div[@role='document']/descendant::button[1]")
	
	WebElement exit;
	
	
	@FindBy(xpath = "//h1[@role='textbox']")
	
	WebElement textbox;
	
	
	@FindBy(xpath = "//button[text()='Publish']")
	
	WebElement publish;
	
	
	@FindBy(xpath = "//div[@class='editor-post-publish-panel']/descendant::button[1]")
	
	WebElement post;
	
	
	public Wordpresspage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
				
	      
	public void validateWordpressPost(String usernme , String pass) {
		
		
		username.sendKeys(usernme);
		
		password.sendKeys(pass);
		
		login.click();
		
	}
	     
	    public void validateWordpressPost(String text) {
	    	
	    	
        Actions actions = new Actions(driver);

        actions.moveToElement(posts).build().perform();
        
        addnew.click();
        
        exit.click();
        
        textbox.sendKeys(text);
        
        publish.click();
        
        post.click();
        
	}
}
