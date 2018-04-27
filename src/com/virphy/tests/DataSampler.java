package com.virphy.tests;

import org.testng.annotations.Test;

import com.virphy.utils.DataSuppliers;

public class DataSampler {
  @Test(testName="employeeDetails",dataProviderClass=DataSuppliers.class,dataProvider = "employee", description="This test case runs data with Name and EmployeeID",invocationCount=2)
  public void employeeDetails(int employeeID, String name) {
	  System.out.print("Name:"+name + "|" );
	  System.out.println("EmployeeID:"+employeeID);
	  
  }

  /*@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 275106, "Sandeep" },
      new Object[] { 213456, "Ravi" },
      new Object[] { 223456, "Raghu" },
      new Object[] { 233456, "Dileep" },
    };
  }*/
}
