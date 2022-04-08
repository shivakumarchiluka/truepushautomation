package com.truepush.qa.utilities;

import java.io.File;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Testut {
	
	static WebDriver driver;

	static Sheet sheet;

	static Workbook book;

	public static long PAGELOAD_TIMEOUT=99;
	
	
	  public static long IMPLICIT_WAIT=50;
	  
	  
		public static void takeScreenshot() throws IOException {
			
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("/home/exe0028/Desktop/shiva/Truepushautomation");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + "screenshot.png"));
			
		}

		
	  
		
		
		public static String TESTDATA_SHEET_PATH = "/home/exe0028/Desktop/shiva/Truepushautomation/src/main"
				+ "/java/com/truepush/qa/testdata/campaigns.xlsx";
	  

	public static Object[][] getCampaignTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
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
	
	
	
	
	
	
	
	
	
	public static String TESTDATA_SHEET_PATH1 = "/home/exe0028/Desktop/shiva/Truepushautomation/src/main"
			+ "/java/com/truepush/qa/testdata/RSS.xlsx";
  

public static Object[][] getRSSTestData(String sheetName) {
	FileInputStream file = null;
	try {
		file = new FileInputStream(TESTDATA_SHEET_PATH1);
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








public static String TESTDATA_SHEET_PATH2 = "/home/exe0028/Desktop/shiva/Truepushautomation/"
		+ "src/main/java/com/truepush/qa/testdata/segments.xlsx";


public static Object[][] getSegmentTestData(String sheetName) {
FileInputStream file = null;
try {
	file = new FileInputStream(TESTDATA_SHEET_PATH2);
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



public static String TESTDATA_SHEET_PATH3 = "/home/exe0028/Desktop/shiva/Truepushautomation/src"
		+ "/main/java/com/truepush/qa/testdata/templates.xlsx";


public static Object[][] getTemplateTestData(String sheetName) {
FileInputStream file = null;
try {
	file = new FileInputStream(TESTDATA_SHEET_PATH3);
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








public static String TESTDATA_SHEET_PATH4 = "/home/exe0028/Desktop/shiva/Truepushautomation/src/main"
		+ "/java/com/truepush/qa/testdata/triggers.xlsx";


public static Object[][] getTriggerTestData(String sheetName) {
FileInputStream file = null;
try {
	file = new FileInputStream(TESTDATA_SHEET_PATH4);
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



}
