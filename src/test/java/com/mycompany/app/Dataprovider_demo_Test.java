package com.mycompany.app;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dataprovider_demo_Test {
  @Test(dataProvider = "dp")
  public void kite_login(String id, String pass) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vithu\\May-selenium-2022\\Binary\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	  
	  WebElement login = driver.findElement(By.xpath("//button[text()='Login ']"));
	  
	  userid.sendKeys(id);
	  password.sendKeys(pass);
	  login.click();
	  System.out.println("thread id for kite: "+Thread.currentThread().getId());
	  
  }

  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {{"DU0468","123456"},
    						{"DU2564","256487"},
    						{"DU2568","201253"},
    						{"DU2345","875642"},
    						{"DU9870","897564"}};
  }
}
