package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{
	//declare WebDriver
	private WebDriver driver;
	
	//Initialization for driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//locators
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By continuebtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkoutbtn=By.xpath("//button[text()='Checkout']");
	
	
	//public methods
	public void getApp()
	{
		driver.findElement(cartbtn).click();
		System.out.println("**********Cart Page Open************");
	}
	
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
		System.out.println("After Removing the product We are on same Cart page!");
		
	}
	
	public void doContinue()
	{
		driver.findElement(continuebtn).click();
		System.out.println("After continue we are on Inventory page!");
	}
	
	
	public void doCheckOut()
	{
		driver.findElement(checkoutbtn).click();
		System.out.println("After Checkout we are on Checkout page!");
	}
	
	
	
	
	
}
