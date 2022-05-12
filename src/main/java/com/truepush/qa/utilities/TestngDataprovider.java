package com.truepush.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestngDataprovider {
	
	
	
	@DataProvider(name = "dataprovider")

	public Object[][] getdata() throws Exception {

		File excelfile = new File("/home/exe0028/Desktop/shiva/Truepushautomation/src/main/java/com/truepush/"
				+ "qa/testdata/templates.xlsx"
				);
		
		System.out.println(excelfile.exists());
		
		FileInputStream inputstream = new FileInputStream(excelfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);//raw data
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int totalrows = sheet.getPhysicalNumberOfRows();
		inputstream.close();

		int totalcolumns = sheet.getRow(0).getLastCellNum();//no.of columns
		
		
		Object[][] data = new String[totalrows-1][totalcolumns];
				
				
		for(int i = 1 ; i<totalrows-1 ; i++)
			
		{
			for(int j = 1 ; j < totalcolumns ; j++) {
				
				
			//	DataFormatter format = new DataFormatter();
				
		data[i][j] = 	sheet.getRow(i).getCell(j).toString();

				
				//format.formatCellValue((Cell)sheet.getRow(i+1).getCell(j).getRichStringCellValue());
				
			//	sheet.getRow(i).getCell(j).getRichStringCellValue();
			}
			
		}
		
		inputstream.close();
		
		
		return data;
	
	}
}
