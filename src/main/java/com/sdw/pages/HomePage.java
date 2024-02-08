package com.sdw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdw.driver.Driver;

public final class HomePage {

	private final By signInButton = By.xpath("//*[@class='button-default outline-dark-button' and text()='Sign In']");
	private final By watchDemoButton = By
			.xpath("//*[@class='button-default solid-dark-button' and text()='Watch Demo']");
	private final By cookies = By.xpath("//button[text()='Accept Cookies']");
	private final By explorePropertyManagement = By.xpath("//*[@title='Marketing & Leasing Explore Link']/child::*");
	private final By exploreAccounting = By.xpath("//*[@title='Accounting Explore Link']/child::*");

	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
	WebElement element;

	//Used explicit wait for visibility of element
	public void acceptCookieButton() {
		element = Driver.getDriver().findElement(cookies);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickSignInButton() {
		element = Driver.getDriver().findElement(signInButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickWatchDemoButton() {
		element = Driver.getDriver().findElement(watchDemoButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	//Used JavascriptExecutor and explicit wait till invisibility of that element
	public void clickMarketingAndExploring() {
		element = Driver.getDriver().findElement(explorePropertyManagement);
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor exe = (JavascriptExecutor) Driver.getDriver();
		exe.executeScript("arguments[0].click();", element);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	//Used JavascriptExecutor and explicit wait till invisibility of that element
	public void clickAccounting() {
		element = Driver.getDriver().findElement(exploreAccounting);
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor exe = (JavascriptExecutor) Driver.getDriver();
		exe.executeScript("arguments[0].click();", element);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
