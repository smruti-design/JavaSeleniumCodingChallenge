package com.sdw.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sdw.driver.Driver;

public class BaseClass {

	WebDriver driver;

	protected BaseClass() {

	}

	@BeforeMethod
	public void setUp() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
