package com.virphy.tests;

import org.testng.annotations.Test;

import com.virphy.common.BaseClass;

public class SeleniumHome extends BaseClass {
  @Test
  public void seleniumURL() {
	  System.out.println("Gmail login is successfull");
	  driver.get("http://www.seleniumhq.org");
  }
}
