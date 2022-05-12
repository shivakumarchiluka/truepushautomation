package com.truepush.qa.testbase;





import java.io.File;
import java.io.FileInputStream;









import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.truepush.qa.utilities.Testut;
import com.truepush.qa.utilities.Webeventlistener;



public class TestBase {



	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver eventdriver;
	public static Webeventlistener eventListener;
	
	public static ExtentReports report;
	
	public static ExtentTest test;


	//to read the properties and initializing the prop variable 

	 
	public TestBase(){
	

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/exe0028/Desktop/shiva/Truepushautomation/src/main/java/"
					+ "com/truepush/qa/configuration/config.properties");

			//FileInputStream ip = new FileInputStream("/home/exe0028/Desktop/shiva/miniproject/src/main/java/com/truepush"
				//	+ "/qa/configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	



	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		 if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "/home/exe0028/Desktop/shiva/chromedriver.exe");
			 driver = new ChromeDriver();

		 }
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/home/exe0028/Desktop/shiva/chromedriver.exe");	
				driver = new FirefoxDriver(); 

			}
		 
			driver.manage().timeouts().pageLoadTimeout(Testut.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testut.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Testut.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);


		eventdriver = new EventFiringWebDriver (driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new Webeventlistener();
		eventdriver.register(eventListener);
		driver = eventdriver;

	}
	
	
	public static void initialize() {
		
		String browserName = prop.getProperty("browser");
		 if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "/home/exe0028/Desktop/shiva/chromedriver.exe");
			 driver = new ChromeDriver();

		 }
		 
			driver.manage().timeouts().pageLoadTimeout(Testut.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testut.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("mainurl"));
		driver.manage().timeouts().pageLoadTimeout(Testut.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
	}

		

	
	
		public static void login(String username, String password) throws Exception {

			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.cssSelector("input[type=password]")).sendKeys(password);
			WebElement Loginbtn = driver
					.findElement(By.xpath("//h1[text()='Login to your Truepush account']/following::button[1]"));
			Loginbtn.click();
			Thread.sleep(2000);
	//orangehrm
		}

		
		
		public static  String takeScreenShot(WebDriver driver) throws IOException {
			
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File Destinationfile = new File("/home/exe0028/Desktop/shiva/Truepushautomation/images"+System.currentTimeMillis()+".png");
			
		String absolutepath = 	Destinationfile.getAbsolutePath();
			
		FileUtils.copyFile(scrFile, Destinationfile);
		
		return absolutepath;
			
		}


		public void onTestStart(ITestResult Result) {
			// TODO Auto-generated method stub
			
		}



		public void onTestSuccess(ITestResult Result) {
			// TODO Auto-generated method stub
			
		}



		public void onTestFailure(ITestResult Result) {
			// TODO Auto-generated method stub
			
		}



		public void onTestSkipped(ITestResult Result) {
			// TODO Auto-generated method stub
			
		}



		public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
			// TODO Auto-generated method stub
			
		}



		public void onStart(ITestContext Context) {
			// TODO Auto-generated method stub
			
		}



		public void onFinish(ITestContext Context) {
			// TODO Auto-generated method stub
			
		}
		
	
		
		
		
		


}
	 
	

