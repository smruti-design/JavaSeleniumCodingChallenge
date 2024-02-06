package com.sdw.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdw.driver.Driver;
import com.sdw.pages.HomePage;

public class HomePageTest extends BaseClass {

	private HomePageTest() {

	}

	//validate the title of home page
	@Test
	public void validateTheTitleOfHomePage() {
		Assert.assertEquals(Driver.getDriver().getTitle(), "Property Management Software | Entrata");
	}

	//validate the title of marketing & exploring page
	@Test
	public void validateTitleOfMarketingAndExploringPage() {
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickMarketingAndExploring();
		Assert.assertEquals(Driver.getDriver().getTitle(),
				"Entrata Marketing & Leasing Products for your property management needs");

	}

	
	//validate the title of accounting page
	@Test
	public void validateTitleOfAccountingPage() {
		HomePage home = new HomePage();
		home.acceptCookieButton();
		home.clickAccounting();
		Assert.assertEquals(Driver.getDriver().getTitle(), "Accounting Solutions for Real Estate Property Management");

	}

}
