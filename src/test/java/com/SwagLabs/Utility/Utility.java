package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
	public static void screenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./"+"\\screenshot\\SwagLabs"+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is dropdwon support multiple selection?: "+dd.isMultiple());
		
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
		
	}
		public static WebElement waitForVisibility(WebDriver driver,By loc)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		}
		
		public static WebElement waitForPresence(WebDriver driver,By loc)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
			
		}

		public static WebElement waitForElemenetToClick(WebDriver driver,By loc)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.elementToBeClickable(loc));
			
		}
	}

