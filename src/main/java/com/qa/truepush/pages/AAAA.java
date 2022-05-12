package com.qa.truepush.pages;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AAAA {

	
	static int day = 23;
	
static	String month = "May";

static String  year= "2023";
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/home/exe0028/Desktop/shiva/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.truepush.com/home/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("microcontroller8051@outlook.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("chiluka@1997");
		driver.findElement(By.xpath("//button[@class=\"is-lg px-50 upper-case is-primary is-block@sm-below\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("controller")).click();
		Thread.sleep(2000);
		

		
		
		//subscribers feature
		driver.findElement(By.xpath("//nav[@class='main-nav']/child::a[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		driver.findElement(By.cssSelector("input[placeholder='(http(s)://www.example.com)']"))
		.sendKeys("https://tutorialspoint.com");
        Thread.sleep(1000);
      driver.findElement(By.cssSelector("input[name=title]")).sendKeys("tutorials library");
    driver.findElement(By.cssSelector("textarea[name='body']")).sendKeys("learn different types tools and technologies!");
       Thread.sleep(1000);


JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;


jsexecuter.executeScript("window.scrollTo(0,500)");


driver.findElement(By.cssSelector("label[for=\"scheduleOpt2\"]")).click();

driver.findElement(By.cssSelector("input[placeholder=\"Select Date\"]")).click();

Thread.sleep(2000);

WebElement mon = driver.findElement(By.xpath("//select[@class=\"monthselect\"]"));

Select sel = new Select(mon);

sel.selectByVisibleText(month);

WebElement yea = driver.findElement(By.xpath("//select[@class=\"yearselect\"]"));

Select sele = new Select(yea);

sele.selectByVisibleText(year);

List<WebElement> dates =  driver.findElements(By.xpath("//input[@placeholder=\"Select Date\"]/following::div[34]//table//tbody//tr//td"));
	
	
int totaldates = dates.size();
	
	for(int i = 0 ; i < totaldates ;  i++)
	{
		
		
	String neu = dates.get(i).getText();
		
	
	if(neu.equals("23"))
	{
		
		dates.get(i).click();
		
		break;
	}
		
	}
	
	driver.findElement(By.xpath("//button[starts-with(@class, \"apply\")]")).click();
	
	driver.findElement(By.xpath("//button[text() = \"Schedule\"]")).click();
	
	//new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();
/*

<test name="truepush Registration">

<classes>

<class name="com.truepush.qa.testcases.RegistrationPageTest"></class>

</classes>

</test>






<test name="Truepush Feedback">

<classes>

<class name="com.truepush.qa.testcases.FeedbackTest"></class>

</classes>

</test>





*
*
*/
	}

}
