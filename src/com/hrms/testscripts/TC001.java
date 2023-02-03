package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {

	//public static void main(String[] args)throws Exception{
		@Test
		public void tc001()throws Exception
		{
//Test Steps
			DOMConfigurator.configure("log4j.xml");
		General m=new General();
		m.openApplication();
		m.login();
		Thread.sleep(3200);
		//m.enterFrame();
		//m.addNewEmpDetails();
		Thread.sleep(3200);
		//m.exitFrame();
		Thread.sleep(3200);
		m.logout();
		m.closeApplication();
		Thread.sleep(3200);
		
	}

}
