package com.virphy.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test started to Open the Browser...");
  }
  
  @Test(priority=1,groups="REG")
  public void register() {
	  System.out.println("Register is executed successfully in browser...");
  }
  @Test(priority=2,groups="Smoke")
  public void login() {
	  System.out.println("Login is executed successfully in browser...");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test is triggered to close the browser..");
  }

}
