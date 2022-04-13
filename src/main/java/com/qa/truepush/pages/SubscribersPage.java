package com.qa.truepush.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.truepush.qa.testbase.TestBase;

public class SubscribersPage extends TestBase{

	
	Robot robot;
	
	@FindBy(xpath = "//div[@class='tabs-body']/descendant::a[8]")
	
	WebElement nextpagesubscribers;
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[2]")
	
	WebElement categorywisestats;
	
	
	@FindBy(xpath = "//section[@class=\"tabs\"]/descendant::h5[1]")
	
	WebElement browsersubs;
	
	@FindBy(xpath = "//section[@class=\"tabs\"]/descendant::h5[2]")

	
	WebElement platformsubs;

	
	
	@FindBy(xpath = "//section[@class=\"tabs\"]/descendant::h5[3]")

	
	WebElement countrysubs;

	
	@FindBy(xpath = "//div[@class='main-wrapper']/descendant::a[29]")
	
	WebElement platformwisenextpage;
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[3]")
	
	WebElement subscribers;
	
	
	@FindBy(css = "input[name=\"subId\"]")
	
	WebElement searchsubscriberusingId;
	
	
	
	@FindBy(xpath = "//input[@name=\"selectedDate\"]")
	
	WebElement daterange;
	
	
	
	@FindBy(xpath = "//select[@name='recordsPerPage']")
	
	WebElement status; // all, active ,inactive
	
	
	
	@FindBy(xpath = "//div[@class='flex']/child::li[4]")
	
	WebElement testusers;
	
	
	public SubscribersPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyCategoryWiseStats() {
		
		categorywisestats.click();
				


		
	}
	
	public boolean verifyBrowsersWiseSubscribers() {
		
		categorywisestats.click();

		
		return	browsersubs.isDisplayed();

		
	}
	
	
	public boolean verifyPlatformWiseSubscribers() {
		
		categorywisestats.click();


		return	platformsubs.isDisplayed();
		
	}
	
	
	public boolean verifyCountryWiseSubscribers() {
		
		categorywisestats.click();

		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
		
		
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        
		return	countrysubs.isDisplayed();
		
	}
	
	
	public void verifySubscribersUsingID(String id) throws AWTException {
		
		
		subscribers.click();
		
		searchsubscriberusingId.sendKeys(id);
		
		 robot = new Robot();
		 
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);

		
		
		
		
	}
	
	
	public void verifySubscribersUsingDate(String date) throws AWTException {
		
		subscribers.click();

		daterange.sendKeys(date);
		
		 robot = new Robot();
		 
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);

		
	}
	
	
	public void verifySubscribersStatus() {
		
		subscribers.click();

		
		Select select = new Select(status);
		
	select.selectByVisibleText("ACTIVE");
	
	}
	
	
	
	public void verifyTestUsers() {
		
		testusers.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
