package com.virphy.utils;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataSuppliers {
	 
  @DataProvider(name="employee",parallel=true)
	  public Object[][] employee() {
	    return new Object[][] {
	      new Object[] { 275106, "Sandeep" },
	      new Object[] { 213456, "Ravi" },
	      new Object[] { 223456, "Raghu" },
	      new Object[] { 233456, "Dileep" },
	    };
	  }

  @DataProvider(name="student")
  public Object[][] student() {
    return new Object[][] {
      new Object[] { "Dileep", "B.Tech-EEE" },
      new Object[] { "Sandeep", "B.Tech-EC" },
      new Object[] { "Raghu", "B.Tech-EEE" },
      new Object[] { "Ravi", "B.Tech-EC" },
    };
  }
}
