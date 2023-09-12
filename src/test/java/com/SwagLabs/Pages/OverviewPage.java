package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage 
{

	private WebDriver driver;
	
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By data=By.id("checkout_summary_container");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2");
	
	//Method
	
	public void getDetails()
	{
		String text=driver.findElement(data).getText();
		System.out.println(text);
	}
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
		System.out.println(driver.findElement(msg).getText());
	}
	
}
