package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
//public static void main(String args[])
//{
	@Test
	public void tc002()
	{
	//Test Steps
		DOMConfigurator.configure("log4j.xml");
	General m=new General();
	m.openApplication();
	m.login();
	m.enterFrame();
    m.addEMPDetails();
	m.exitFrame();
    m.logout();
	m.closeApplication();
}
}
