package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage
{
	//declare webdriver
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	//Public methods
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	
	
	public void doCheckOut(String f,String l,String z)
	{
		driver.findElement(fname).sendKeys(f);
		driver.findElement(lname).sendKeys(l);
		driver.findElement(zipcode).sendKeys(z);
		driver.findElement(continuebtn).click();
	}
	
	
	
	
	

}
