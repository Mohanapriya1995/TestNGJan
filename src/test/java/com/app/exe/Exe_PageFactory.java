package com.app.exe;

import com.app.pageexe.PageExe_PageFactory;

public class Exe_PageFactory extends PageExe_PageFactory  {
	
	public static void main(String[] args) {
		browser("https://adactinhotelapp.com/");
		username();
		password();
		login_Buuton();
	}

}
