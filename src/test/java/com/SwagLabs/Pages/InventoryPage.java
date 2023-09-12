package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{
	
	private WebDriver driver;
	
	//initialization of driver
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locators
	private By totalproduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By productname=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	

	//methods
	
	public int getTotalProductCount()
	{
		int count=driver.findElements(totalproduct).size();
		return count;
	}
	
	public void getProductName()
	{
		List<WebElement> allProducts=driver.findElements(productname);
		System.out.println("**********Product Names are**********");
		
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
			
		}
		
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> allProducts=driver.findElements(productname);
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addtocartbtn).click();
		System.out.println("Selected Product added to cart!");
	}
	
	
	
	
	
	
	

}
