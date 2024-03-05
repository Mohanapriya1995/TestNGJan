package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.Locators_PageFactory;

public class PageExe_PageFactory extends Locators_PageFactory {
	
	public static void username() {
		BaseClass.input_text( new Locators_PageFactory().getUsername(),BaseClass.prop_reuse("username"));
	}
	
	public static void password() {
		BaseClass.input_text( new Locators_PageFactory().getPassword(), "123456");
	}
	
	public static void login_Buuton() {
		BaseClass.click_value(new Locators_PageFactory().getLogin());
	}

}
