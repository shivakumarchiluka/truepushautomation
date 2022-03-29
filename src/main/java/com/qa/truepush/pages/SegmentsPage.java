package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.truepush.qa.testbase.TestBase;

public class SegmentsPage extends TestBase {

	
	
	@FindBy(xpath = "//button[text()='New Segment']")
	
	WebElement createsegment;
	
	
	@FindBy(xpath = "//input[@name='segname']")
	
	WebElement segmentName;
	
	
	@FindBy(xpath = "//textarea[@name='description']")
	
	WebElement segmentsNotes;
	
	
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
	
	
	@FindBy(id = "as")  //drop down
	
	WebElement  segementcondition;
	
	
	@FindBy(xpath = "//div[@class=\\\"multiselect-dropdown\\\"]")
	
	WebElement segmentvalue;
	
	
	@FindBy(xpath = "//div[text()='Select All']")
	
	WebElement selectallsegmentvalues;
	
	
	@FindBy(xpath = "\"//button[text()='Create New Segment']\"")
	
	WebElement createnewsegment;
	
	
	@FindBy(xpath = "//button[text() = \" Add New Property \"]")
	
	WebElement Addnewproperty;
	
	@FindBy(xpath = "//button[text() = \" Add New Condition\"]")
	
	WebElement Addnewcondition;
	
	
	@FindBy(xpath = "//h3[text() = \"What are Segments?\"]")
	
	WebElement Aboutsegments;
	
	
	
}
