package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class Locators extends BaseClass {
	
	public static WebElement getusername() {
		return driver.findElement(By.id("username"));
		
	}
	
	public static WebElement getpassword() {
		return driver.findElement(By.id("password"));
		
	}
	
	public static WebElement getloginbutton() {
		return driver.findElement(By.id("login"));
		
	}
	
}
