package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;

public class General extends Global {
// to provide all re_usable fun:/methods related to whole application
	public void openApplication()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Chromedriver\\chromedriver_win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Appilication");
		Log.info("Application Opened");
		
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Closed Application");
		Log.info("Application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login completed");
	}
	public void enterFrame()
	{
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered Frame");
		Log.info("Entered Frame");
	}
	public void addEMPDetails()
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_save)).click();
		driver.findElement(By.xpath(btn_back)).click();
		System.out.println("Employee details Added");
		Log.info("Employee Details Add");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("LogOut completed");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Frame Exited");
		Log.info("Frame Exited");
	}
}

