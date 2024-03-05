package com.app.exe;

import com.app.pageexe.PageExe;

public class Exe extends PageExe {
	
	public static void main(String[] args) {
		browser("https://adactinhotelapp.com/");
		username();
		password();
		loginButton();
	}

}
