package com.qa.truepush.pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class ProjectPage extends TestBase{

	@FindBy(linkText="extent")

	WebElement projectId;
	
	
	@FindBy(linkText="controller")

	WebElement project;
	
	
	
	@FindBy(xpath="//section[@class='component-wrapper']/descendant::a[2]")
	
	WebElement users;
	
	
	@FindBy(xpath="//button[text() = \"New Project\"]")
	
	WebElement Newproject;
	
	
	@FindBy(css = "span[role=\"tooltip\"]")
	
	WebElement sortbysubscribercount;
	
	
	
	@FindBy(xpath = "//a[@class=\"project-type website\" and  @title =\"tinnier-chests.000webhostapp.com/\"]")
	
	
	WebElement platform;
	
	
	@FindBy(xpath = "//table[@class=\"table\"]/descendant::button[1]")
	
	
	WebElement editprojectname;
	
	
	@FindBy(css = "input[name=\"appName\"]")
	
	
	WebElement  enternewprojectname;
	
	
	@FindBy(css = "button[type=\"submit\"]")
	
	
	WebElement submit;
	
	
	@FindBy(xpath = "//table[@class=\"table\"]/descendant::button[2]")
	
	
	WebElement cloneproject;
	
	
	
	@FindBy(id = "ProjectName")
	
	
	WebElement entercloneprojectname;
	
	
	@FindBy(css = "input[name=\"url\"]")
	
	
	WebElement url;
	
	
	@FindBy(css = "label[for=\"banner_image\"]")
	
	
	WebElement uploadimage;
	
	
	@FindBy(css = "label[for=\"welcome_notification\"]")
	
	
	WebElement clonewelcome;
	
	
	@FindBy(xpath = "//label[@for=\"welcome_notification\"]/following::label[1]")
	
	WebElement userinteraction;
	
	
	@FindBy(css = "button[type=\"submit\"]")
	
	WebElement importbutton;
	
	
	@FindBy(xpath = "//table[@class=\"table\"]/descendant::button[7]")
	
	
	WebElement deleteproject;
	
		
	
	@FindBy(xpath = "//table[@class=\"table\"]/descendant::button[4]" )
	
	
	WebElement tokeninfo;
	 
	
	
	@FindBy(xpath = "//table[@class=\"table\"]/descendant::button[4]/following::label[1]")
	
	
	WebElement accessbutton;
	
	



	
	
	
	
	public ProjectPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public DashboardPage clickOnProjectlink() {
		
	
	projectId.click();
       
	return new DashboardPage();
	
	}
	

	
	public UsersPage clickOnUserslink() {
		
		users.click();
		
		return new UsersPage();
		
	}
	
	public NewProjectPage clickOnNewProjectButton () {
		
		Newproject.click();
		
		return new NewProjectPage(); 
	}
	

	
	public DashboardPage clickonproject() {
		
		
		project.click();
		
		
		return new DashboardPage();
	}
	
	
	public void verifySortBySubscribersButton() {
		
		
		sortbysubscribercount.click();    	
		

		
		
		
	}
	
    
	public SettingsPage verifyPlatform() {
		
		
		platform.click();
		
		return new SettingsPage();
	}
	
	
	public void verifyProjectEditButton(String name) {
		
		editprojectname.click();
		
		enternewprojectname.sendKeys(name);
		
		submit.click();
		
	}
	
	public void verifyCloneProject(String clonename , String wurl) throws AWTException {
		
		cloneproject.click();
		
		entercloneprojectname.sendKeys(clonename);
		
		url.sendKeys(wurl);
		 
		uploadimage.click();
		
    		Robot robo = new Robot();
    		
    		robo.keyPress(KeyEvent.VK_ENTER);
    		
    		robo.keyRelease(KeyEvent.VK_ENTER);
    		

        		clonewelcome.click();    
        		
        		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
        		
                jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        		SettingsPage setting = new SettingsPage();
        		
        		setting.clickWelcomeNotification("hai", "hello");
        		
                jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    		
    		importbutton.click();
    		
    		
	}
	       public void verifyDeleteProjectButton() {
	    	   
	    	   
	    	   deleteproject.click();
	    	   
	       }
	
	public void verifyTokenInfo() {
		
		
		tokeninfo.click();
		
		
	}
	
	
	
	public void verifyAccessButton() {
		
		accessbutton.click();
		
		
	}
	
	
	
	
	
	
	
	}

	
	
	
	
	
	

