package com.ts.qa.testcases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ts.qa.base.TestBase;
import com.ts.qa.pages.HomePage;
import com.ts.qa.pages.LoginPage;

public class LoginpageTest extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;

	
	//  public LoginpageTest() { super(); }
	 
	
	@BeforeTest
	public void setup() throws IOException
	{
		initialization();
		System.out.println("Initialize success");
		loginpage = new LoginPage();
		homepage = new HomePage();
		
	}
	
	@Test
	public void loginPageTitleTest() throws Exception
	{
		System.out.println("enter  test method");
		String title = loginpage.validateLoginpageTitle();
		System.out.println("inside logintest:"+title);
	    Assert.assertEquals(title,"Sign into your Townscript Account");
	}
	
//	@Test
//	public void loginTest() throws InterruptedException
//	
//	{
//
//		
//		String dashboardTitle=homepage.ValidateDashboardtitle();
//		Thread.sleep(3000);
//	   System.out.println(dashboardTitle);
//	   Assert.assertEquals(dashboardTitle,"Dashboard|Townscript");
//		
//	}
	
	
	  @AfterTest 
	  public void tearDown() 
	  { driver.quit(); }
	 
	


}
