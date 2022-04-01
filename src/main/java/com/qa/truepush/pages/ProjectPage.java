package com.qa.truepush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.truepush.qa.testbase.TestBase;

public class ProjectPage extends TestBase{

	@FindBy(linkText="nonviolence")

	WebElement projectId;
	
	@FindBy(linkText="controller")

	WebElement project;
	
	@FindBy(xpath="//a[@title='solarsystem']")
	WebElement projectId_02;
	
	@FindBy(xpath="//section[@class='component-wrapper']/descendant::a[2]")
	WebElement users;
	
	@FindBy(xpath="//section[@class='component-wrapper']/descendant::button[5]")
	WebElement Newproject;
	
	@FindBy(css="button.profile-icon")
	WebElement  profile;
	
	
	public ProjectPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public DashboardPage clickOnProjectlink() {
	
	projectId.click();
       
	return new DashboardPage();
	
	}
	
	public DashboardPage clickOnProject2link() {
		
		projectId_02.click();
		
		return new DashboardPage();
	}
	
	public UsersPage clickOnUserslink() {
		users.click();
		
		return new UsersPage();
	}
	
	public NewProjectPage clickOnNewProjectlink () {
		
		Newproject.click();
		
		return new NewProjectPage(); 
	}
	
	public ProfilePage ClickOnprofilePage(){
		
		profile.click();
		
		return new ProfilePage();
		
	}
	
	public DashboardPage clickonproject() {
		
		project.click();
		
		return new DashboardPage();
	}
	
	
	

	
	
	}

	
	
	
	
	
	

