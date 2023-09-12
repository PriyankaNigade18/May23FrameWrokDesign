package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTestCase extends BaseClass
{
	
	
  @Test(priority=1)
  public void verifyTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Swag"),"Title validation fail");
	  System.out.println("Title validation Pass");
  }
  
  @Test(priority=2)
  public void verifylogin()
  {
	  lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(lp.getAppCurrentUrl().contains("inventory"),"Login fail");
	  System.out.println("Login is completed successfully!");
  }
  
  
  @Test(priority=3)
  public void verifyCurrentUrl()
  {
	  String url=lp.getAppCurrentUrl(); 
	  Assert.assertTrue(url.contains("inventory"),"Url not match");
	  System.out.println("Url is matched: "+url);
  }
  
}
