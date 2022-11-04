package com.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(com.listeners.ListenersTestNG.class)
public class Dataprovider_demo {
  @Test(dataProvider = "dp")
  public void arithmatic_add(Integer num1, Integer num2)
  {
	  int sum = num1+num2;
	  System.out.println("sum of num1 and num2 are: "+sum);
  }
  @Test(dataProvider = "dp")
  public void arithmatic_sub(Integer num1, Integer num2)
  {
	  int sub = num1-num2;
	  System.out.println("subtraction of num1 and num2 are: "+sub);
  }
  @Test(dataProvider = "dp")
  public void arithmatic_mul(Integer num1, Integer num2)
  {
	  int mul = num1*num2;
	  System.out.println("multiplication of num1 and num2 are: "+mul);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {{ 15,20},{11,22},{10,5} };
      
    };
  }

