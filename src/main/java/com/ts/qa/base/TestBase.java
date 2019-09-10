package com.ts.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ts.qa.util.TestUtil;

import com.ts.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener event_listener;

	public static final String JENKINS_BUILD_PATH = "/var/lib/jenkins/workspace/MavenDemotest_Pom/";

	public TestBase() 
	{
		prop = new Properties();
		try {
			System.out.println("resding config properties");
			FileInputStream ip = new FileInputStream(JENKINS_BUILD_PATH+"configfiles/config.properties");
			prop.load(ip);
			System.out.println("prop load successfully");

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


			System.setProperty("webdriver.chrome.driver",JENKINS_BUILD_PATH+"drivers/chromedriver");
//			ChromeOptions chromeOptions = new ChromeOptions(); 
//            chromeOptions.addArguments("--headless");
//            System.out.println("Initialize chromedriver");
//            driver = new ChromeDriver(chromeOptions);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			WebDriver driver = new ChromeDriver(options);
            e_driver = new EventFiringWebDriver(driver);
            event_listener = new WebEventListener();
            e_driver.register(event_listener);
            driver=e_driver;
			System.out.println("chromedriver object created");
			driver.manage().window().maximize();
			System.out.println("windows maximized");
			driver.manage().deleteAllCookies();
			System.out.println("cookies deleted");
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			System.out.println("opening url");
			driver.get(prop.getProperty("url"));
			System.out.println("url opened success");
		}

	}

}
