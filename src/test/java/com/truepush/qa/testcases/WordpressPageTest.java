package com.truepush.qa.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.qa.truepush.pages.Wordpresspage;
import com.truepush.qa.utilities.Testut;

public class WordpressPageTest {

	
	WebDriver driver;
	
	
	
	@BeforeMethod
	
	public void setUp() {
		
		 System.setProperty("webdriver.chrome.driver", "/home/exe0028/Desktop/shiva/chromedriver.exe");
        
		 driver = new ChromeDriver();
		 
			driver.manage().timeouts().pageLoadTimeout(Testut.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(Testut.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
		driver.manage().window().maximize();
		
	}
		
@Test

public void validateWordpressPost() {
	
	Wordpresspage word = new Wordpresspage();
	
	driver.get("https://undesigned-show.000webhostapp.com/wp-admin");

	
	word.validateWordpressPost("solarsystem19999@outlook.com", "Chiluka@1997");
	
	word.validateWordpressPost("\n"
			+ "Monkeypox is a disease caused by the monkeypox virus. It is a viral zoonotic disease, meaning "
			+ "that it can spread from animals to humans. It can also spread between people.");
}

@AfterMethod


public void tearDown() {
	   
	   driver.close();
}
}