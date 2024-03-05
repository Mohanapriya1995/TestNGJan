package com.app.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Parallel_Test {
	WebDriver driver ;
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1() {
		
		driver.findElement(By.id("email")).sendKeys("Aiite");
	}

	@Test
	public void test2() {
		
		driver.findElement(By.id("email")).sendKeys("Aiite");
	}

	
	@AfterTest
	public void aftertest() {
		driver.close();
	}
}
