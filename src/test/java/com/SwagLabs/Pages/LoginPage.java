package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=data+functions
	
	//declare webdriver
	private WebDriver driver;
	
	//Initialization
	public LoginPage(WebDriver driver)//base class driver
	{
		this.driver=driver;
	}
	
	//Identification-By locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By button=By.id("login-button");
	
	
	//Public method to access that data
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(button).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	

}
