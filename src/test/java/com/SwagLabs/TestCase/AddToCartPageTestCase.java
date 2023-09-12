package com.SwagLabs.TestCase;

import org.testng.annotations.Test;

public class AddToCartPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void VerifyAppOpenstate() 
  {
	  ap.getApp();
	  waitStep();
  }
  
  
  @Test(priority=2)
  public void verifyRemove() 
  {
	  ap.doRemove();
	  waitStep();
  }
  
  @Test(priority=3)
  public void verifyContinue() 
  {
	  ap.doContinue();
	  waitStep();
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
	  waitStep();
	  ap.getApp();
	  waitStep();
  }
  
  @Test(priority=4)
  public void verifyCheckOut() 
  {
	  ap.doCheckOut();
  }
}


