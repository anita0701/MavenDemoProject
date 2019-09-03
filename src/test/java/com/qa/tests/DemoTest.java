package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(enabled=true)
	public void sum()
	{
		int a=2,b=5;
		int c=a+b;
	    Assert.assertEquals(c,7);
	    System.out.println("Pass Sum");		
	}
	
	@Test(enabled=true)
	public void multiply()
	{
		int a=2,b=5;
		int c=a*b;
	    Assert.assertEquals(c,10);
	    System.out.println("Pass Multiply");		
	}
		

}
