package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.truepush.qa.testbase.TestBase;

public class CodeIntegraionPage extends TestBase {

	
	@FindBy(xpath = "//button[text()='Download sw.js']")
	
	WebElement downloadswkr;
	
	
	@FindBy(xpath = "//h3[text()='How to integrate code']")
	
	WebElement integratecodetext;
	
	

	@FindBy(xpath = "//button[text()='Download sw.js']/following::button[1]")
	
	WebElement script;
	

	@FindBy(xpath = "//button[text()='Download sw.js']/following::button[4]")
	
	WebElement addtag;
	
	

	@FindBy(xpath = "//button[text()='Download sw.js']/following::button[7]")
	
	WebElement removetag;
	
	

	@FindBy(xpath = "//button[text()='Download sw.js']/following::button[10]")
	
	WebElement gettag;
	
	@FindBy(xpath = "//label[@class='checkbox']/descendant::span[1]")
	
	WebElement checkbox;
	
	
	@FindBy(xpath = "//input[@type = \"text\"]")
	
	WebElement email;
	
	
	@FindBy(css = "button[data-title=\"Add another Email Id\"]")
	
	WebElement  addanotheremail;  
	
	@FindBy(xpath = "//button[text() = \"Send Code\"]")
	
	WebElement sendcode;
	
	
	@FindBy(xpath = "//li[text()=\"AMP\"]")
	
	WebElement amp;
	

	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[1]")
	
	WebElement  ampscript;
	
	
	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[4]")
	
	WebElement  ampwphf;  
	
	
	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[5]")
	
	WebElement  ampwppd;
	
	
	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[6]")
	
	WebElement  ampwebpushscript;
	
	
	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[9]")
	
	WebElement  ampwidgetstyle;
	

	@FindBy(xpath = "//li[text()=\"AMP\"]/following::button[12]")
	
	WebElement  ampwidget;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}