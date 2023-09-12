package com.SwagLabs.TestCase;

import org.testng.annotations.Test;

public class CheckOutPageTestCase extends BaseClass
{
  @Test(priority=1,enabled=false)
  public void verifyCancel()
  {
	  cp.doCancel();
  }
  
  @Test(priority=2)
  public void verifyCheckout()
  {
	  cp.doCheckOut("Jay","Nigade","411047");
  }
}
