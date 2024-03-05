package com.app.sampletest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

}
