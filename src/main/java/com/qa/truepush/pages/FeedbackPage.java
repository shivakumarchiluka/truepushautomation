package com.qa.truepush.pages;

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
	
	
}
