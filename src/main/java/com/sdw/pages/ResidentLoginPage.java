package com.sdw.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdw.driver.Driver;

public class ResidentLoginPage {

	private static final By residentLoginLink = By.xpath("//*[text()='Resident Login']");
	private static final By viewTheWebsiteButton = By.xpath("//*[text()='View the Website']");
	private static final By contactUsForm = By.xpath(
			"//*[@id='contact_us_form']/child::*[text()='If you have any questions or feedback, please fill out the form below']");

	private static final By name = By.xpath("//input[@id='name']");
	private static final By email = By.xpath("//input[@id='email']");
	private static final By propertyName = By.xpath("//input[@id='property_name']");
	private static final By propertyURL = By.xpath("//input[@id='property_url']");
	private static final By category = By.xpath("//select[@id='category']");
	private static final By message = By.xpath("//textarea[@id='message']");

	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
	WebElement element;

	public void clickResidentLoginButton() {
		element = Driver.getDriver().findElement(residentLoginLink);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickViewWebsiteButton() {
		element = Driver.getDriver().findElement(viewTheWebsiteButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public WebElement visibilityOfContactUsForm() {
		return Driver.getDriver().findElement(contactUsForm);
	}

	public WebElement inputName() {
		return Driver.getDriver().findElement(name);
	}

	public WebElement inputEmail() {
		return Driver.getDriver().findElement(email);
	}

	public WebElement inputPropertyName() {
		return Driver.getDriver().findElement(propertyName);
	}

	public WebElement inputPropertyURL() {
		return Driver.getDriver().findElement(propertyURL);
	}

	public List<WebElement> categoryDropDown() {
		return Driver.getDriver().findElements(category);
	}

	public WebElement inputMessage() {
		return Driver.getDriver().findElement(message);
	}

	public void selectElementFromDropDownByText(String options) {
		element = Driver.getDriver().findElement(category);
		Select select = new Select(element);
		select.selectByVisibleText(options);
	}
}
