package com.truepush.qa.testcases;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;

import com.qa.truepush.pages.CampaignPage;
import com.qa.truepush.pages.Loginpage;
import com.qa.truepush.pages.Maininterface;
import com.qa.truepush.pages.ProjectPage;
import com.qa.truepush.pages.TemplatesPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.truepush.qa.testbase.TestBase;



public class TemplateTest  extends TestBase {

	

	
	
	
	 Loginpage loginpage;

	ProjectPage projectpage;
	
	
	Maininterface maininterface;
	
	
	 static TemplatesPage template;
	
	
	 static String sheetName = "template";
	
	public TemplateTest() {
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setup()  {

		initialization();
				 
		 loginpage = new Loginpage();
		 
		  loginpage.Validatelogin(prop.getProperty("email"), prop.getProperty("password"));
 
		 projectpage = new ProjectPage();
 
		         projectpage.clickOnProjectlink();
		 
          maininterface = new Maininterface();
          
      template =  maininterface.clickontemplateslink();
          
         template = new TemplatesPage(); 
         
			report = new ExtentReports("/home/exe0028/Desktop/shiva/Truepushautomation/report/report.html", true);

	}
	
	
	@Test(priority = 1)
	
	public void validateTemplateCreationTest() {
		
	test = 	report.startTest("validate Template Creation Test");
		
		template.createTemplate("w3schools", "https://w3schools.com", "programming languages",
				
				"learn full stack development,testing,frameworks etc");
		
	}  
	
/*	@DataProvider
	
	public  Object[][] TemplateTestdata() {
		
		Object[][] data = Testut.getTemplateTestData(sheetName);
		
		return data;
	} 
	

	
   @Test(dataProvider = "TemplateTestdata")
	
	public void  validateTemplateDTTTest(String TemplateName ,String LandingPageURL, String Title, String Message) {
		
		template.createTemplateDTT(TemplateName, LandingPageURL, Title, Message);
		
   }
   
   
   @DataProvider(name ="TemplatesTestdata")
   
		Object[][] getTemplateTestData(String sheetName) {
	   FileInputStream file = null;
	   try {
	   	file = new FileInputStream("/home/exe0028/Desktop/shiva/Truepushautomation/src/main/java/com"
	   			+ "/qa/truepush/data/templates.xlsx");
	   } catch (FileNotFoundException e) {
	   	e.printStackTrace();
	   }
	   try {
	   	book = WorkbookFactory.create(file);
	   } catch (InvalidFormatException e) {
	   	e.printStackTrace();
	   } catch (IOException e) {
	   	e.printStackTrace();
	   }
	   sheet = book.getSheet(sheetName);
	   Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	   // System.out.println(sheet.getLastRowNum() + "--------" +
	   // sheet.getRow(0).getLastCellNum());
	   for (int i = 0; i < sheet.getLastRowNum(); i++) {
	   	for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
	   		data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
	   		// System.out.println(data[i][k]);
	   	}
	   }
	   return data;

	   }
   
   
*/
		
		

	
	@Test(priority = 2)
	
	public void validateSecondTemplateCreationTest() {
		
		test = report.startTest("validate Second Template Test");
		
		template.createTemplateDTT("jiomart","https://jiomart.com","order groceries,essentials etc",
				"avail the free home delivery service");
		
		
	}
	
	
	@Test(priority = 3)
	
	public void  validateEditTemplateTest() throws Throwable {
		
		test = report.startTest("validate Edit Template Test");
		
	//	Thread.sleep(2000);
		
		template.templateButton();
		
		CampaignPage  camp= new CampaignPage();
		
		camp.editCampaign("https://fraazo.com", "buy fresh fruits and veggies", "order fresh fruits at best prices");
		
  		JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
		
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
        
		
		template.editTemplate();
		

	}
	
	
	
	
	@AfterMethod
 	public void tearDown(ITestResult result) throws IOException{
 		
 		if(result.getStatus()==ITestResult.FAILURE){
 			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = TemplateTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
 			
 		}
 		
 		else if(result.getStatus()==ITestResult.SKIP){
 			
 			test.log(LogStatus.SKIP, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 			
 		test.log(LogStatus.SKIP, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
 			
 			String screenshotPath = TemplateTest.getScreenshot(driver, result.getName());
 			
 			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
 			
 			
 		}
 			report.endTest(test);
 			
 			driver.close();
 			
 		}	
	
	
	
	
	
	
	
	
}
