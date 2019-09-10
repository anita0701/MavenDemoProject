package com.ts.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ts.qa.base.TestBase;

public class LoginPage extends TestBase{


	//Initialization of page objects 
		public LoginPage() {
			//super();
			PageFactory.initElements(driver,this);
		}
		
	//Page Factory
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]/span")
	WebElement login;
	
	@FindBy(xpath="//h2[@class='text-center secondary-header-booking']")
	WebElement titletext;
	
	
	
	
	//Actions 
	public String validateLoginpageTitle()
	{
		System.out.println("Title: "+titletext.getText());
	
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
	
	public HomePage login(String un,String pwd)
	{
		email.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
}
