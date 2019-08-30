package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest1 {
	
	@Test
	public void subtraction()
	{
		int a= 10;
		int b=5;
		Assert.assertEquals(a-b, 5);
	}

}
