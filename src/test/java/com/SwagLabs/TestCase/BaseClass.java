package com.SwagLabs.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesUtil;
import com.SwagLabs.Utility.Utility;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverviewPage  op;
	public PropertiesUtil p1;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		p1=new PropertiesUtil();
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("**************Login Test*********");
		System.out.println("Verified Title: "+lp.getAppTitle());
		Utility.screenshot(driver);
		lp.doLogin(p1.getData("un"),p1.getData("psw"));
		Utility.screenshot(driver);
		waitStep();
		System.out.println("Verified Current url: "+lp.getAppCurrentUrl());
		System.out.println("****************Inventory Test*********");
		System.out.println("Total Products are: "+ip.getTotalProductCount());
		Utility.screenshot(driver);
		ip.getProductName();
		waitStep();
		Utility.screenshot(driver);
		ip.addProductToCart(p1.getData("pname"));
		Utility.screenshot(driver);
		System.out.println("**************AddToCar Test***********");
		waitStep();
		ap.getApp();
		Utility.screenshot(driver);
		ap.doRemove();
		Utility.screenshot(driver);
		waitStep();
		ap.doContinue();
		Utility.screenshot(driver);
		waitStep();
		ip.addProductToCart(p1.getData("pname"));
		waitStep();
		ap.getApp();
		waitStep();
		ap.doCheckOut();
		System.out.println("*****************Checkout Test***********");
		Utility.screenshot(driver);
		cp.doCheckOut(p1.getData("fname"),p1.getData("lname"),p1.getData("zcode"));
		Utility.screenshot(driver);
	}
	
	
	public void waitStep()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
