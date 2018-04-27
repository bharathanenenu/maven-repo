package com.virphy.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public static WebDriver driver;
	
	//public static String browser="Firefox";
  
  @Parameters("browser")
  @BeforeClass
  public void configBrowser(String browser) {
	  
	  if(browser.equals("Firefox")) {
		  System.out.println("Firefox Browser is opened");
		  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\lib\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }else if(browser.equals("Chrome")) {
		  System.out.println("Chrome Browser is Opened");
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }else if(browser.equals("IE")) {
		  System.out.println("IE Browser is opened");
		  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
		  driver= new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }else {
		  System.out.println("No browser matched...");
	  }
	  
  }

  @AfterClass
  public void closeBrowser() {
	  System.out.println("Closing the browser..");
	  driver.quit();
  }

}
