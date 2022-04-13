package com.qa.truepush.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAA {

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
		/*subscribers feature*/
		driver.findElement(By.xpath("//nav[@class='main-nav']/child::a[2]")).click();
		Thread.sleep(2000);
	
	}

}
