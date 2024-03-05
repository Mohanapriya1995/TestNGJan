package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.Locators;

public class PageExe extends Locators {
	
	public static void username() {
		BaseClass.input_text(Locators.getusername(), BaseClass.excelread_base(1, 0));
	}
	
	public static void password() {
		BaseClass.input_text(Locators.getpassword(), BaseClass.excelread_base(1, 1));
	}

	public static void loginButton() {
		BaseClass.click_value(Locators.getloginbutton());
	}
}
