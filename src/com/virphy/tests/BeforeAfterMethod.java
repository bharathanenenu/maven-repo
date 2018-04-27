package com.virphy.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method is invoked for browser opening..");
  }
  
  @Test(groups="REG")
  public void register() {
	  System.out.println("Register is executed successfully in browser...");
	  Assert.assertEquals(2>1, 2>1);
	  System.out.println("Test executed successfully");
	  
  }
  @Test(dependsOnMethods="register",enabled=true)
  public void login() {
	  System.out.println("Login is executed successfully in browser...");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method is invoked for closing browser..");
  }

}
