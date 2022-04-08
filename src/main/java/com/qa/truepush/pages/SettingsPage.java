package com.qa.truepush.pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.truepush.qa.testbase.TestBase;

public class SettingsPage extends TestBase{

	
	
	@FindBy(xpath = "//input[@id = \"apiToken\"]")
	
	WebElement APIkey;
	
	
	@FindBy(xpath = "//label[text()=\"REST API Key\"]")
	
	WebElement RestAPI;
	
	
	@FindBy(xpath = "//label[text()=\"APP Id\"]")
	
	WebElement APPIdTxt;
	

	@FindBy(css = "input#appId")
	
	WebElement APPId;
	
	

	@FindBy(xpath = "//td[text()='website']/following::button[5]")
	
	WebElement RegenarateAPI;
	
	

	@FindBy(xpath = "//td[text()='website']/following::button[6]")
	
	WebElement Maximumnotifications;
	
	
	@FindBy(css = "input[inputmode = \"numeric\"]")
	
	WebElement numeric;
	
	
	@FindBy(xpath = "//button[text() = \"Update\"]")
	
	WebElement update;
	
	
	@FindBy(xpath = "//td[text()='website']/following::button[1]")
	
	WebElement Edit;
	
	
	@FindBy(xpath = "//td[text()='website']/following::button[2]")
	
	WebElement delete;

    
	
	@FindBy(xpath = "//input[@aria-label=\"Text input with dropdown button\"]")
	
	WebElement Enterwebsiteurl;
	
	
	
	@FindBy(xpath = "//a[text() = \"Read our documentation\"]")
	
	WebElement readdocumentation;
	
	
	@FindBy(css = "div[class=\"ig_close\"]")
	
	WebElement exit;
	
	
	@FindBy(xpath = "//div[@class=\"td-container tdc-content-wrap \"]/preceding::a[35]")
	
	WebElement  writeforus;
	
	
	@FindBy(xpath = "//strong[text()=\"Suggested Topics\"]")
	
	WebElement suggestedtopics;
	
	
	@FindBy(xpath = "//button[@onclick=\"truepush.HideOptin('close')\"]")
	
	WebElement Notallow;
	
	
	@FindBy(xpath = "//button[@onclick=\"truepush.subscribeUserByTwoWayOptIn('hide')\"]")
	
	WebElement Allow;
	
	
	@FindBy(css = "div[class=\"drift-widget-controller-icon square\"]")
	
	WebElement turn;
	
	
	@FindBy(css = "button.remove-image")
	
	WebElement removeimage;
	
	
	
    @FindBy(css = "label[aria-label='Upload Product Icon']")

	WebElement producticon;
    
    
    @FindBy(xpath = "//input[@name = \"safari\"]/following::label[1]")
    
    WebElement Enablesafaribrowser;
    
	
	@FindBy(xpath = "//button[text()='Change Optin']")
	
	WebElement changeoptin;
	
	
	@FindBy(xpath = "//span[text()='Box']")//bell ,Optin-bar,default browser,cutom default+
	
	WebElement optinstyle;
	
	
	@FindBy(xpath = "//button[text()='Choose This Style']")
	
	WebElement savethestyle;
	
	
	@FindBy(xpath = "//button[text()='Edit Content']")
	
	WebElement editcontent;
	
	
	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[1]")
	
	WebElement maintext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[2]")
	
	WebElement firstbuttontext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[3]")
	
	WebElement Subtext;
	

	@FindBy(xpath = "//div[@class='modal-body']/descendant::input[4]")
	
	WebElement secondbuttontext;
	
	
	@FindBy(xpath ="//button[text()='Save Content']")
	
	WebElement savecontent;
	
	
    @FindBy(xpath = "//button[text()='Reset To Default']")
	
	WebElement  resettodefault;
	
	
    @FindBy(xpath = "//input[@name='welcomeNotif']/following-sibling::label")
	
	WebElement welcomenotification;
	
	
	 @FindBy(xpath = "//h5[text()='Create Welcome Notification']/following::button[1]")
	
	WebElement  createwelcomenotification;
	
	
	
    @FindBy(css = "input[name='tempTitle']")
	
	WebElement entertitle;
	
	
    @FindBy(css = "textarea[name='message']")
	
	WebElement entermessage;
	
	
    @FindBy(xpath = "//span[text()='User Interaction Required']")

	WebElement userinteraction;
	
	
	 @FindBy(xpath = "//button[text()='Save Notification']")
    
	WebElement savenotification;
	
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::button[1]")

	 WebElement Askoptinafter;
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::h6[3]") //default zero seconds
    
	 WebElement  fiveseconds;
	
	
	 @FindBy(xpath = "//label[text()='Default Settings']/following::button[2]")

   	WebElement optinfrequentshow;
	 
	 
	 @FindBy(xpath = "//a[text() = \"Read our documentation\"]/following::h6[4]") // default page refresh
	 
	 WebElement newsession;
	 
	 
	 
	 @FindBy(css = "button[type = \"submit\"]")
	 
	 WebElement updateplatform;
	 
	 
	 @FindBy(xpath = "//li[text()='GDPR']")
	 
	 WebElement GDPR;
	 
	 
	 public SettingsPage() {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 
	 
	public void editSettings(String url) {
		
		
		Edit.click();
		
		Enterwebsiteurl.clear();
		
		Enterwebsiteurl.sendKeys(url);
		
	}
	
	public void verifyDocumentationLink() {
		
		
		Edit.click();

		
		readdocumentation.click();
		
        Set<String> windowhandles = driver.getWindowHandles();
		System.out.print(windowhandles);
	    Iterator<String>iterator = windowhandles.iterator();
	    String parentwindow = iterator.next();
	    System.out.println(parentwindow);
	    String childwindow = iterator.next();
	    System.out.println(childwindow);
	    
	    driver.switchTo().window(childwindow);
	    
	    exit.click();
	    
	    Notallow.click();
	    
	    driver.close();
	    
	    driver.switchTo().window(parentwindow);
	    
	   Enablesafaribrowser.click();
	   
	   driver.close();
	}
		
	




	public void verifyEditOptinStyle() {
		
		Edit.click();

		changeoptin.click();
		
		    optinstyle.click();
		
		           savethestyle.click();
		           
	}
	
		public void verifyOptinContent(String maintxt ,String subtxt,String firsttxt,String secondtxt){
			
			Edit.click();

		editcontent.click();
		
		          maintext.sendKeys(maintxt);
		
    firstbuttontext.sendKeys(firsttxt);
		
	        	Subtext.sendKeys(subtxt);
		
	               	secondbuttontext.sendKeys(secondtxt);
		
		savecontent.click();
		
		
	}
	 
	 public void verifyWelcomeNotification(String title,String message) {
		 
			Edit.click();

		 
		 welcomenotification.click();
		 
		 
		createwelcomenotification.click();
		 
		
		           entertitle.sendKeys(title);
		 
		           
		 entermessage.sendKeys(message);
		 
		 
	     	 userinteraction.click();
	     	 
		 
	               	 savenotification.click();
		 
	 }
	 
	 
	 public boolean verifyRestApiKey() {
		 
		 
	return	RestAPI.isDisplayed();

	 }
	 
	 
	 public boolean verifyAPPId() {
		 
		 
		 return APPIdTxt.isDisplayed();
	 }
	 
	 
 public void verifyProjectIcon() throws Exception {
	 
		Edit.click();

	 removeimage.click();
		
	 producticon.click();
	 
     StringSelection filepath = new StringSelection("/home/exe0028/Desktop/axesmethods.png");
     
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
	     
	Robot robot = new Robot();
	
	robot.delay(250);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.delay(250);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	
	JavascriptExecutor jsscript = (JavascriptExecutor)driver;

	jsscript.executeScript("window.scrollTo(0,500)");
	
	updateplatform.click();

	 
 }
	 
	public void verifyDefaultSettings() {
		
		Edit.click();
		
		Askoptinafter.click();
		
		fiveseconds.click();
		
		optinfrequentshow.click();
		
		newsession.click();
	
		
		updateplatform.click();
		
		driver.close();
		
	} 
	 
    public void verifyMaxmimumNotificaionsInputBox(String num) {
   	 
   	 
   	 Maximumnotifications.click();
   	 
   	 numeric.sendKeys(num);
   	 
   	 update.click();
   	 
   	 
   	 
    }
	 
	 
    public void verifyRegenerateToken() {
    	
    	RegenarateAPI.click();
    	
    	
    }
    
    	
    public void verifyGDPRLink() {
    	
    	
    	GDPR.click();
    	
    	JavascriptExecutor jsscript = (JavascriptExecutor)driver;

    	jsscript.executeScript("window.scrollTo(0,1500)");
    	
    	
    }
}
