package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest2 {
	
	@Test
	public void division()
	{
		int a= 10;
		int b=5;
		Assert.assertEquals(a/b, 2);
		
	}

}
