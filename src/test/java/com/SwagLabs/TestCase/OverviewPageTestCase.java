package com.SwagLabs.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyProductDetails()
  {
	  op.getDetails();
  }
  
  @Test(priority=2)
  public void verifyFinish()
  {
	  op.doFinish();
  }
  
}
