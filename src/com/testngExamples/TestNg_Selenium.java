package com.testngExamples;
 import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Selenium {
	@BeforeClass
	public void login()
	{
		System.out.println("Application Login ");
		
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout Appilcation ");
	}
	@BeforeMethod
	public void addEMP()
	{
		System.out.println("Add emp Details ");
	}
	@Test
	public void delEMP() 
	{
		System.out.println("del employe Details ");
	}

}
