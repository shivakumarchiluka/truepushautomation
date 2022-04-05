package com.qa.truepush.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.truepush.qa.testbase.TestBase;

public class SegmentsPage extends TestBase {

	
	
	@FindBy(xpath = "//button[text()='Create Segment']")
	
	WebElement createsegment;
	
	
	@FindBy(xpath = "//button[contains(text(),\"New\")]") //after adding the first segment we use this element
	
	WebElement addnewsegment;
	
	@FindBy(xpath = "//input[@name='segname']")
	
	WebElement segmentName;
	
	
	@FindBy(xpath = "//textarea[@name='description']")
	
	WebElement segmentNotes;
	
	
	@FindBy(css = "div.segment-select")
	
	WebElement segmentproperty;
	
	@FindBy(xpath = "//label[text()='Browser']")
	/*OS
	Country
	Browser
	Day of week
	Hour of day
	Subscription date
	Last visited date
	Platform
	State
	City */
	
	WebElement	Browser;
	
	
	@FindBy(xpath = "//select[@name = \"values\"]")  //drop down
	
	WebElement  segementcondition;
	
	
	@FindBy(xpath = "//div[@class=\"multiselect-dropdown\"]")
	
	WebElement segmentvalue;
	
	
	@FindBy(xpath = "//div[@class=\"multiselect-dropdown\"]/descendant::li[1]")
	
	WebElement selectallsegmentvalues;
	
	
	@FindBy(xpath = "//button[text()='Create New Segment']")
	
	WebElement submitsegment;
	
	
	@FindBy(xpath = "//button[text() = \" Add New Property \"]")
	
	WebElement Addnewproperty;
	
	
	@FindBy(xpath = "//button[text() = \" Add New Condition\"]")
	
	WebElement Addnewcondition;
	
	
	@FindBy(xpath = "//h3[text() = \"What are Segments?\"]")
	
	WebElement Aboutsegments;
	
	
	@FindBy(xpath = "//button[contains(text(),\"New\")]/following::button[1]") //element for editing the single segment 
	
	WebElement editsegment;
	
	
	@FindBy(css = "button[type =\"submit\"]")
	
	WebElement savechanges;
	
	
	public SegmentsPage() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	
	
	public void createSegment(String name , String notes) {
		
		createsegment.click();

		
		segmentName.sendKeys(name);
		
		segmentNotes.sendKeys(notes);
		
		segmentproperty.click();
		
		Browser.click();
		
		
	}
		
		public void createSegment() {
			
			
	Select select = new Select(segementcondition);
		
          select.selectByVisibleText("Contains any of");	

		segmentvalue.click();
		
		selectallsegmentvalues.click();
		
		
		submitsegment.click();
		
	}	
	
	
	
		public void createSegmentDDT(String SegmentName , String SegmentNotes) {

	      
			addnewsegment.click();

			
			segmentName.sendKeys(SegmentName);
			
			segmentNotes.sendKeys(SegmentNotes);
			
			segmentproperty.click();
			
			Browser.click();
	
			
	Select select = new Select(segementcondition);
		
          select.selectByVisibleText("Contains any of");	

		segmentvalue.click();
		
		selectallsegmentvalues.click();
		
		
		submitsegment.click();
	
		}
	
	
	public void editSegment( String notes) {
		
		editsegment.click();
		
	  //  WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	    //WebElement segmentName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='segname']")));
		
		segmentNotes.clear();
		
		segmentNotes.sendKeys(notes);
		
		segmentproperty.click();
		
		Browser.click();
		
	}
	
	
		public void editsegment() {
			
		Select select = new Select(segementcondition);
		
        select.selectByVisibleText("Does not contains");	

		segmentvalue.click();
		
		selectallsegmentvalues.click();
		
		savechanges.click();
		
	}
	
	
	
	
	
}
