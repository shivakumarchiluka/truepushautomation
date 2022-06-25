package com.qa.extentreportlisteners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanager {
	
	private static ExtentReports extent;
	
static	WebDriver driver;
	
	

    public static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
       
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "SHIVA KUMAR");
        extent.setSystemInfo("Organization", "Way2ONLINE");
        
        
        return extent;
    }

    public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		try {
			FileUtils.copyFile(scrFile, new File("/home/exe0028/Desktop/shiva/Truepushautomation/report" + screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
	
	
	
	
	
	
	

}
