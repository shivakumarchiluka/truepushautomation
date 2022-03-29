   package com.qa.truepush.pages;

   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;
   import org.openqa.selenium.support.PageFactory;

    import com.truepush.qa.testbase.TestBase;


    public class RegistrationPage extends TestBase {

	@FindBy(xpath = "//a[@routerlink='/home/register']")
	
	WebElement registerlink;
	
	@FindBy(id = "name")
	
	 WebElement Name;
	
	
	@FindBy(id = "email")
	
	
	 WebElement Email;
	
	 
	 @FindBy(id = "password")
		
	 
	 WebElement Password;
		
		 
   	@FindBy(xpath = "//input[@type='checkbox']/following::span[1]")
			
   	
   	WebElement checkbox;
			
	@FindBy(xpath = "//button[text()='Register']")
	
	 WebElement Register;
	
	
	public  RegistrationPage() {
		
		
	PageFactory.initElements(driver,this);
	
	                        }
	
	public void clickonregisterlink(String name, String email, String password) {
		
		registerlink.click();
		
		Name.sendKeys(name);
		
		Email.sendKeys(email);
		
		Password.sendKeys(password);
	}
	
	
	
	
	
	
	
	
	
}
