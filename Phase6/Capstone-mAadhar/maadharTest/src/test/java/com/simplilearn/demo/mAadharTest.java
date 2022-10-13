package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mAadharTest {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ebine\\eclipse JAR Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@AfterClass
	public void afterClass() {
		driver = null;
	}
	
  @Test
  public void User() throws InterruptedException{
	  driver.get("http://localhost:4200/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("Ebinesar");
	  driver.findElement(By.name("password")).sendKeys("Ebinesar");
	  driver.findElement(By.name("role")).sendKeys("User");
	  Thread.sleep(5000);Thread.sleep(5000);
	  driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div.col-md-4.mt-3.mb-2 > form > div.d-grid.gap-2.d-md-flex.justify-content-md-end > button")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.cssSelector("body > app-root > app-user-dashboard > div.container.row > div:nth-child(2) > button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.name("name")).sendKeys("Vijay");
	  driver.findElement(By.name("dob")).sendKeys("2000-12-30");
	  driver.findElement(By.name("gender")).sendKeys("Male");
	  driver.findElement(By.name("mobile")).sendKeys("9312457861");
	  driver.findElement(By.name("houseno")).sendKeys("864");
	  driver.findElement(By.name("street")).sendKeys("oaoglkc");
	  driver.findElement(By.name("district")).sendKeys("Chennai");
	  driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
	  driver.findElement(By.name("pincode")).sendKeys("645257");
	  driver.findElement(By.cssSelector("body > app-root > app-apply-aadhar > div > div > div > form > div.d-grid.gap-2.d-md-flex.justify-content-md-end > button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  driver.get("http://localhost:4200/user");
	  driver.findElement(By.name("aadharnumber")).sendKeys("8115403527276941");
	  driver.findElement(By.cssSelector("body > app-root > app-user-dashboard > div.jumbotron > form > div:nth-child(2) > button")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.cssSelector("body > app-root > app-user-dashboard > div.jumbotron > form > div:nth-child(3) > div:nth-child(4) > button")).click();
	   Thread.sleep(5000);
  }
  
  @Test
  public void Admin() throws InterruptedException{
	  driver.get("http://localhost:4200/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("renny");
	  driver.findElement(By.name("password")).sendKeys("ren");
	  driver.findElement(By.name("role")).sendKeys("Admin");
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div.col-md-4.mt-3.mb-2 > form > div.d-grid.gap-2.d-md-flex.justify-content-md-end > button")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.cssSelector("body > app-root > app-admin-dashboard > div.jumbotron > div > a")).click();
	  Thread.sleep(5000);
  }
}
