package com.ts.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ts.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	static String  user_dir = System.getProperty("user.dir");
	
	public TestBase() 
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(user_dir+"//configfiles//config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName =  prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.out.println("setting driver path");
			System.setProperty("webdriver.chrome.driver", user_dir +"//drivers//chromedriver");
			System.out.println("Initialize chromedriver");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			 
			 driver.get(prop.getProperty("url"));
			 }
		
	}

}
