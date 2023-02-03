package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
 public WebDriver driver;
//Test Data
// DT  Var  
public String url="http://183.82.103.245/nareshit/login.php";
public String un="nareshit";
public String pw="nareshit";
public String EFN="Chaithanya";
public String ELN="Perikala";
public String EID="0001";

//object/Elements
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String link_logout="Logout";
public String frame_empinfo="rightMenu";
public String btn_Add="//input[@value='Add']";
public String txt_EFN="txtEmpFirstName";
public String txt_ELN="txtEmpLastName";
public String btn_save="btnEdit";
public String btn_back="//input[@value='Back']";
public String btn_search="//input[@value='Search']";
public String check_box="//input[@value='1149]";
public String drop_down="//input[@value='loc_code']";
}





