package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum()
	{
		int a=2,b=5;
		int c=a+b;
	    Assert.assertEquals(c,7);
		
	}
	

	@Test
	public void multiply()
	{
		int a=2,b=5;
		int c=a*b;
	    Assert.assertEquals(c,10);
		
	}
	

}
