package com.jbk.jenkinsDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomePage {
	
	WebDriver driver ;
	
	
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.chrome.driver", "chromedriver");
		  driver = new ChromeDriver();
		  driver.get("https://andsons-v3.myshopify.com/");
		  driver.manage().window().maximize();
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
	
	  
	  
  @Test
  public void CheckPageURL() {
	  
	  String actURL = driver.getCurrentUrl();
	  String ExpURL = "https://andsons-v3.myshopify.com/";
	  AssertJUnit.assertEquals(actURL, ExpURL);
	  
  }


}
