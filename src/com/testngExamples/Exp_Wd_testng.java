package com.testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Wd_testng 
{
	WebDriver driver;
	@BeforeClass
	public void launchbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Chromedriver\\chromedriver_win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
@Test
public void tc001() throws Exception
{
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Reporter.log("Login Completed");
	Reporter.log(driver.getTitle());
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
}
}
