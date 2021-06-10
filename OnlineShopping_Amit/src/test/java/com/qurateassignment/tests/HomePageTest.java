package com.qurateassignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qurateassignment.base.Base;
import com.qurateassignment.pages.HomePage;
import com.qurateassignment.utilities.Utilities;

public class HomePageTest extends Base {

	private HomePage hp;

	@Test(description = "test to verify various elemnts on HomePage", priority = 1)
	public void testElementsOnHomePage() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.isUserNotLoggedIn(), "User is logged in !!");
		System.out.println("Is User NOT logged in: " + hp.isUserNotLoggedIn());
		Assert.assertTrue(hp.isHeaderPresent(), "Header Img is not present !!");
		System.out.println("Search bar placeholder text is: " + hp.getSearchBarPlaceHolderText());
		Assert.assertEquals(hp.getSearchBarPlaceHolderText(), "Search",
				"serachBar placeholder text is not equal to Search");

		Assert.assertEquals(hp.getPhoneNumText(), Utilities.getProperty("phoneNumText"),
				"Ph num is not equal to 0123-456-789");
		System.out.println("Phone Number in element is: " + hp.getPhoneNumText());
		Assert.assertEquals(hp.getContactUsToolTipTxt().trim(), Utilities.getProperty("contactUsToolTipText"),
				"Mouse hover text is NOT Contact Us");
		System.out.println("Contact Us tooltip text is: " + hp.getContactUsToolTipTxt());
		Assert.assertTrue(hp.isMenuBarDressesTabPresent(), "dresses tab is not present");
		System.out.println("Is Dresses tab in menu bar present: " + hp.isMenuBarDressesTabPresent());

	}
}
