package com.simplilearn.demo.Lesson2_Automate_WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonSearch {
	WebDriver driver;
	
  @Test
  public void amazonSearch() {
	  driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("boult");
			driver.findElement(By.id("nav-search-submit-button")).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}	
  }
  
  @BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ebine\\eclipse JAR Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver = null;
	}
}
