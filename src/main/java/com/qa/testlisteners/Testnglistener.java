package com.qa.testlisteners;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.truepush.qa.testbase.TestBase;

public class Testnglistener extends TestBase implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult iTestResult) {
	    System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		
	    System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		
	    System.out.println("onTestFailure");
	    
	    
	    
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
	    System.out.println("onTestSkipped");
	}



	@Override
	public void onFinish(ITestContext iTestContext) {
	    System.out.println("onFinish");
	}
	
}
