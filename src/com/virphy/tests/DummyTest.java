package com.virphy.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.common.BrowserHooks;

public class DummyTest extends BrowserHooks {
	 @Test(dataProvider="hardCodedBrowsers")
	  public void sample(String browser,String version,String os, Method method) throws FileNotFoundException, IOException {
		  this.createDriver(browser, version, os, method.getName());
		  WebDriver driver = this.getWebDriver();
		  driver.get("");
		 
	  }
}
