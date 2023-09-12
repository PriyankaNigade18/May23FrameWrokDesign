package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTestCase extends BaseClass
{
	
  @Test(priority=1)
  public void verifyTotalProductCount() 
  {
	  int count=ip.getTotalProductCount(); 
	  Assert.assertEquals(count,6,"count is not matched!");
	  System.out.println("Total Products are: "+count);
  }
    
  
  @Test(priority=2)
  public void verifyProductName()
  {
	  ip.getProductName();
  }
  
  @Test(priority=3)
  public void verifyAddToCart()
  {
	ip.addProductToCart("Sauce Labs Fleece Jacket");
	
  }
}
