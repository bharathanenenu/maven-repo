package com.virphy.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.common.BrowserHooks;
import com.virphy.pages.SelHomePage;
import com.virphy.utils.AutoConstants;
import com.virphy.utils.PropFileHandler;


public class SeleniumTest extends BrowserHooks {
  
  @Test(dataProvider="hardCodedBrowsers")
  public void searchSeleniumTest(String browser,String version,String os, Method method) throws FileNotFoundException, IOException {
	  this.createDriver(browser, version, os, method.getName());
	  WebDriver driver = this.getWebDriver();
	  //Page object for selenium homepage
	  SelHomePage objSel = new SelHomePage(driver);
	  
	  //Opening the selenium homepage URL
	  driver.get("http://www.seleniumhq.org");
	  
	  //Type Bahuabali in the search selenium text box and click GO
	  objSel.searchSelenium("bahubali");
	 
  }
}

