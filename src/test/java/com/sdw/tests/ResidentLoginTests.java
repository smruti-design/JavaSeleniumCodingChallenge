package com.sdw.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sdw.pages.HomePage;
import com.sdw.pages.ResidentLoginPage;

public final class ResidentLoginTests extends BaseClass {

	private ResidentLoginTests() {

	}
	
	//Validate the visibility of Contact form

	@Test
	public void visibilityOfContactForm() throws InterruptedException {
		ResidentLoginPage res = new ResidentLoginPage();
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickSignInButton();
		res.clickResidentLoginButton();
		res.clickViewWebsiteButton();
		boolean displayed = res.visibilityOfContactUsForm().isDisplayed();
		Assert.assertTrue(displayed);

	}

	//Data provider for input into the contact us form
	@DataProvider
	public Object[][] getDetails() {
		Object[][] details = new Object[1][5];
		details[0][0] = "Aspiring SDET";
		details[0][1] = "aspiringsdet@gmail.com";
		details[0][2] = "Bangalore";
		details[0][3] = "www.google.com";
		details[0][4] = "This is the text message";

		return details;
	}

	//Validating whether all the mandatory fields are displayed or not
	@Test(dataProvider = "getDetails")
	public void validateMandatoryField(String name, String email, String location, String url, String message) {

		ResidentLoginPage res = new ResidentLoginPage();
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickSignInButton();
		res.clickResidentLoginButton();
		res.clickViewWebsiteButton();
		WebElement webElement = res.inputName();
		boolean check = webElement.isDisplayed();
		Assert.assertTrue(check);
		webElement.sendKeys(name);
		webElement = res.inputEmail();
		check = webElement.isDisplayed();
		Assert.assertTrue(check);
		webElement.sendKeys(email);
		webElement = res.inputPropertyName();
		check = webElement.isDisplayed();
		Assert.assertTrue(check);
		webElement.sendKeys(location);
		webElement = res.inputPropertyURL();
		check = webElement.isDisplayed();
		Assert.assertTrue(check);
		webElement.sendKeys(url);
		webElement = res.inputMessage();
		check = webElement.isDisplayed();
		Assert.assertTrue(check);
		webElement.sendKeys(message);

	}

	
	// select options from the dropdown
	@Test
	public void selectOptionsFromDropDown() {
		ResidentLoginPage res = new ResidentLoginPage();
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickSignInButton();
		res.clickResidentLoginButton();
		res.clickViewWebsiteButton();
		res.selectElementFromDropDownByText("Design");
	}

	
	//validate whether Design word is present inside the options or not
	@Test
	public void validateOptionsFromDropDown() {

		ResidentLoginPage res = new ResidentLoginPage();
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickSignInButton();
		res.clickResidentLoginButton();
		res.clickViewWebsiteButton();
		List<WebElement> list = res.categoryDropDown();
		boolean flag = false;
		for (WebElement element : list) {
			String text = element.getText();
			if (text.contains("Design")) {
				flag = true;
			}
		}
		Assert.assertTrue(flag);

	}

}
