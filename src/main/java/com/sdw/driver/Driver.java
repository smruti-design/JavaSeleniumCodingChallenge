package com.sdw.driver;

import org.openqa.selenium.WebDriver;

import com.sdw.utils.ReadPropertyFiles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	static WebDriver driver;

	public static void initDriver() throws Exception {

		driver = WebDriverManager.chromedriver().create();
		driver.get(ReadPropertyFiles.getProperty("url"));
		driver.manage().window().maximize();

	}

	public static void quitDriver() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
}
