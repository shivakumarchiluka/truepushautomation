package com.qa.truepush.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class FeedbackPage extends TestBase {

	@FindBy(css = "input[name=\"subject\"]")
	
	WebElement entersubject;
	
	@FindBy(css = "textarea[name=\"description\"]")
	
	WebElement enterdescription;
	
	@FindBy(css = "button[type=\"submit\"]")
	
	WebElement sendfeedback;;
	
	
	public FeedbackPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void feedbackForm(String text , String descp)  {
		
		
        Set<String> windowhandles = driver.getWindowHandles();
		System.out.print(windowhandles);
	    Iterator<String>iterator = windowhandles.iterator();
	    String parentwindow = iterator.next();
	    System.out.print(parentwindow);
	    String childwindow = iterator.next();
	    driver.switchTo().window(childwindow);
		
		entersubject.sendKeys(text);
		
		enterdescription.sendKeys(descp);
		
		sendfeedback.click();
		
		driver.switchTo().window(parentwindow);

	}
	
	
	
	
}
