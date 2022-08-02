package com.qa.truepush.pages;





import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class Loginpage extends TestBase{
	
 public Loginpage()  {
	 
		super();
			   
		   PageFactory.initElements(driver, this);
			   
		   }	
//this--pointing to current class object 
	//page factory or object repository
	
	
	@FindBy(name="email")
	
	WebElement Email;
	
	
	@FindBy(css="#fullname")
	
	WebElement Password;
	
	
	@FindBy(xpath="//button[@routerlink=\"/home/login\"]")
	
	WebElement LOGIN;
	
	@FindBy(xpath="//a[@href=\"/home/forgot-password\"]")
	
	WebElement Forgotpassword;
	
	@FindBy(css="#email")
	
	WebElement ForgetEmail;
	
	@FindBy(xpath="//button[text()='Send Verification Link']")
	
	WebElement SendMail;
	

	
	//Initializing the Page Objects:
	//actions
   
   public  ProjectPage Validatelogin(String us, String pass) {
	   
	   
	/*   Set<String> windowhandles = driver.getWindowHandles();
       
       
		//	System.out.print(windowhandles);
			
		    Iterator<String>iterator = windowhandles.iterator();
		    
		    
		    String parentwindow = iterator.next();
		    
		    
		    System.out.print(parentwindow);
		    
		    
		    String childwindow = iterator.next();
		    
		    
		    driver.switchTo().window(childwindow);	 */

	   
	   Email.sendKeys(us);
	   
	   Password.sendKeys(pass);
	   
	   try {
		   
		Thread.sleep(2000);
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	   
	   LOGIN.click();
	   
	   return new ProjectPage();
	   
	   
   }
	   
	   public void validateForgotPasswordLink(String username,String ema) {
		   
		/*   WebDriverWait wait = new WebDriverWait(driver,10);
		   
	     	WebElement element =    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/home/forgot-password\"]")));
		   
          element.click();	*/
		   Email.sendKeys(username);
		   
		   try {
			   
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		   Forgotpassword.click();
		   
		   try {
			   
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		   
		   ForgetEmail.sendKeys(ema);
		   
		   
		   try {
			   
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   
		   SendMail.click();
		   
		   
		   
		   
		   
	   }
   
   



	
}
   
   
	
	
	
	

