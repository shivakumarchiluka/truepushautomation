package com.qa.truepush.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.truepush.qa.testbase.TestBase;

public class CampaignPage extends TestBase {

	
	
	static int day = 19;
	
static	String mont = "Apr";

static String  yea= "2022";
	
	
	
          @FindBy(xpath="//button[text()='Create Campaign']")
          
          
           WebElement createcampaign;
          

          @FindBy(css="input[placeholder='(http(s)://www.example.com)']")
          
          
            WebElement Landingurl;
          

          @FindBy(css="input[name=title]")
          
          
	       WebElement title;
	
	
          @FindBy(css="textarea[name='body']")	
          
          
           WebElement message;

	
	      
	      @FindBy(xpath = "//button[text()='Filters']")
	      
	      WebElement filters;
	      
	      
	      
	      @FindBy(xpath = "//input[@placeholder=\"Enter a new tag\"]")
	      
	      WebElement selectbytagname;
	      
	      
	      
	      
	      @FindBy(css = "input#daterange")
	      
	      WebElement daterange;
	      
	      
	      
	      
	      @FindBy(name = "campaignStatus" )
	      
	      WebElement status;
	      
	      
	      
	      
	      @FindBy(name = "campaignSource")
	      
	      
	      WebElement source;
	      
	      
	      
	      
	      @FindBy(xpath = "//button[text() = \"Search\"]")
	      
	      
	      WebElement searchcampaign;
	      
	      
	      
	      @FindBy(xpath = "//button[text() = \"Reset\"]")
	      
	      
	      WebElement reset;
	      
	      
	      @FindBy(xpath = "//label[@for=\"banner_image\"]")
	      
	      
	      WebElement bannerimage;
	      
	      
	      @FindBy(css = "label[for=\"opt2\"]")
	      
	      
	      WebElement selectfromsegment;
	      
	      
	     @FindBy(xpath = "//main[starts-with(@class,\"modal\")]/descendant::button[2]")
	    
	     WebElement searchbysegment;
	    
	    
	     @FindBy(css= "input[name=\"subId\"]")
	    
	    
	     WebElement entersegmentname;
	    
	    
	     @FindBy(xpath = "//input[@name=\"subId\"]/following::button[1]")
	      
	     
	      WebElement submitsegment;
	      
	    
	      @FindBy(xpath = "//input[@name=\"subId\"]/following::button[3]")
	      
	      
	      WebElement selectbrowser;
	    
	    
	      
	      @FindBy(xpath = "//input[@name=\"subId\"]/following::button[4]")
	      
	      
	      WebElement nextbutton;
	     
	    
	      
	      @FindBy(css = "label[for=\"scheduleOpt2\"]")
	      
	      
	      WebElement checkboxsendlater;
	      
	      
	      @FindBy(css = "input[placeholder=\"Select Date\"]")
	      
	      
	      WebElement selectdate;
	      
	      
	      @FindBy(xpath = "//select[@class=\"monthselect\"]")
	      
	      
	      WebElement month;
	      
	      
	      @FindBy(xpath = "//select[@class=\"yearselect\"]")

	      WebElement year;
	      
	      
	      
	      @FindBy(xpath = "//select[@class=\"hourselect\"]")
	      
	      
	      WebElement selecthour;
	      
	      
	      @FindBy(xpath = "//select[@class=\"minuteselect\"]")
	      
	      
	      WebElement selectmin;
	      
	      
	      @FindBy(xpath = "//select[@class = \"ampmselect\"]")
	      
	      
	      WebElement selectampm;
	           
	      
	      @FindBy(xpath = "//button[starts-with(@class,\"apply\")]")
	      
	      
	      WebElement applybutton;
	      
	      
	      @FindBy(xpath = "//button[text() = \"Schedule\"]")
	      
	      WebElement schedule;
	      
	      
	      @FindBy(xpath = "//button[starts-with(@class, \"apply\")]/following::button[1]")
	      
	      
	      WebElement cancelbutton;
	      
	      
	      @FindBy(xpath = "//span[text() = \"Advanced Details\"]/following::button[1]")
	      
	      
	      WebElement advanceddetails;
	      
	      
	      @FindBy(css = "input[placeholder=\"Button text\"]")
	     
	      
	      WebElement buttontext;
	      
	      
	      @FindBy(css = "input[placeholder=\"Button link\"]")
	      
	      
	      WebElement buttonlink;
	      
	      
	      
	      @FindBy(css = "label[role=\"tooltip\"]")
	      
	      
	      WebElement uploadbuttonicon;
	      
	      
	      
	      @FindBy(xpath = "//strong[text() = \"Add New Button\"]")
	      
	      
	      WebElement addnewbutton;
	      
	      
	      
	      
	      @FindBy(css = "input[aria-label=\"Enter a new tag\"]")
	      
	      
	      WebElement entertagname;
	      
	      
	      
	      
	      @FindBy(css= "label[for=\"notif_icon\"]")
	      
	      
	      WebElement notificationicon;
	      
	      
	      
	      @FindBy(xpath="//button[text()=\"Send Notification \"]")
	      
	      
          WebElement sendnotification; 
	      
	      
	      
	      @FindBy(xpath="//button[starts-with(text(),\"Send To\")]")
	      
	      
          WebElement sendtotestusers;
	      
	      
	      
	      
	
	      public CampaignPage() {
		
	     	PageFactory.initElements(driver, this);
	     	
	     	
	                            }
	
		  public void clickoncreatecampaignDTT(String Enterurl, String Entertitle,String Entermessage) {

			  
			  
			 createcampaign.click();
			  
			  Landingurl.sendKeys(Enterurl);
			  
				title.sendKeys( Entertitle);
				
				  message.sendKeys(Entermessage);
				  
					sendnotification.click();

			
		           }
		  
		  
            public void clickOnCampaignButton() {
            	
	
         	createcampaign.click();
         	
	
            }

            
            
     public void createSimpleCampaign(String Entrurl, String Entrtitle,   String Entrmessage) throws AWTException {

		  Landingurl.sendKeys(Entrurl);
		  
			title.sendKeys( Entrtitle);
			
			  message.sendKeys(Entrmessage);
			  
			  bannerimage.click();
			  
			  Robot robo = new Robot();
			  
			  robo.keyPress(KeyEvent.VK_ENTER);
			  
			  robo.keyRelease(KeyEvent.VK_ENTER);
			  
			  
     }

			  public void createSimpleCampaign(String name)  {
				  
				  
			  selectfromsegment.click();
			  
			  searchbysegment.click();
			  
			  entersegmentname.click();
			  
			  
			  entersegmentname.sendKeys(name);
			  

			  submitsegment.click();
			  

			  
			  selectbrowser.click();

			  
			  nextbutton.click();
			  
          }
     
     public void creatSendLaterCampaign() {
    	 
    	 
    	checkboxsendlater.click();
    	
    	selectdate.click();
    	
    	Select select = new Select(month);

    	select.selectByVisibleText(mont);
    	
    	Select select1 = new Select(year);

    	select1.selectByVisibleText(yea);
    	
    	List<WebElement> dates =  driver.findElements(By.xpath("//input[@placeholder=\"Select Date\"]/following::div[34]//table//tbody//tr//td"));
    	
    	
    	int totaldates = dates.size();
    		
    		for(int i = 0 ; i < totaldates ;  i++)
    		{
    			
    			
    		String neu = dates.get(i).getText();
    			
    		
    		if(neu.equals("19"))
    		{
    			
    			dates.get(i).click();
    			
    			break;
    		}
    			
    		}	
    		

    		
    	 Select select2 = new Select(selecthour);
    	 
    	 select2.selectByValue("11");
 
    	 
    	 Select select3 = new Select(selectmin);
    	 
    	 select3.selectByValue("4");
    	 
    	 
    	 Select select4= new Select(selectampm);
    	 
    	 select4.selectByValue("AM"); 
    	 
    	 applybutton.click();
    	 
    	 schedule.click();
    	 
     }
     
     
     public void createcampaign(String text,String  link,String tagname) throws AWTException, Throwable{
    	 
    	 
 		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
		
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
        Thread.sleep(2000);
        
        advanceddetails.click();
        
        buttontext.sendKeys(text);
        
        buttonlink.sendKeys(link);
        
        uploadbuttonicon.click();
        

		  Robot robo = new Robot();
		  
		  robo.keyPress(KeyEvent.VK_ENTER);
		  
		  robo.keyRelease(KeyEvent.VK_ENTER);
    	 
    	 notificationicon.click();
    	 

    	 		
		  robo.keyPress(KeyEvent.VK_ENTER);
		  
		  robo.keyRelease(KeyEvent.VK_ENTER);
		  
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        

        entertagname.click();

        
        entertagname.sendKeys(tagname);
        
     }
     
     
        public void sendNotification() {
        
 		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
		
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
                
       sendnotification.click();
     }
    
        
        
        
     public void sendCampaignToTestUsers() {
    	 
    	 
    	 sendtotestusers.click();
    	 
     }
     
     
     
     
    
     
     
     public void verifyFilters() {
    	 
    	 
    	 filters.click();
    	 
    	 selectbytagname.click();
    	 
    	 daterange.click();
    	 
    	 Select select = new Select(status);
    	 
    	 select.selectByIndex(3);
    	 
    	 
    	 Select sele = new Select(source);

    	 sele.selectByValue("running");
    	 
    	 searchcampaign.click();
    	 
    	 
     }
		  
              
	  public void editCampaign(String Enterurl, String Entertitle,   String Entermessage) {

		  
		  Landingurl.clear();
		  
			  Landingurl.sendKeys(Enterurl);
			  
			  title.clear();
			  
				title.sendKeys( Entertitle);
				
				message.clear();
				
				  message.sendKeys(Entermessage);
				  
			 		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
					
			        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				  
				  

			
		           }
         
     
     
     
     
     
     
     
     
     
	}


	

	
	
	
	

