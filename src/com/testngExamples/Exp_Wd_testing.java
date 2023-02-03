package com.testngExamples;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Wd_testing {
	public class Exp_Wd_Testng {
		WebDriver driver;

		@BeforeClass
		public void startUp() {
			System.setProperty("webdriver.gecko.driver", "D:\\Chromedriver\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		@AfterClass
		public void tearDown() {
			driver.close();
		}

		@Test
		public void tc001() throws Exception {
			// Excel
			FileInputStream file = new FileInputStream("C:\\Users\\Chaitanya\\OneDrive\\Desktop\\TestData.xls");
			Workbook wb = Workbook.getWorkbook(file);
			Sheet st = wb.getSheet("Sheet1");
			String UserName = st.getCell(0, 1).getContents();
			String Password = st.getCell(1, 1).getContents();
			Reporter.log(UserName);
			Reporter.log(Password);
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			Reporter.log("Application Opened"); // htmlReport
			driver.findElement(By.name("txtUserName")).sendKeys(UserName);
			driver.findElement(By.name("txtPassword")).sendKeys(Password);
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			Reporter.log("Login completed");
			Reporter.log(driver.getTitle());
			System.out.println("Login completed");
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
		}
	}
}
