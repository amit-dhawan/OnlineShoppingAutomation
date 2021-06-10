package com.qurateassignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qurateassignment.base.Base;
import com.qurateassignment.pages.ProductListingsPage;
import com.qurateassignment.utilities.Utilities;

public class ProductListingsPageTest extends Base {

	private ProductListingsPage pl;

	@Test(description = "test Product Listings Page eleemnts", priority = 2)
	public void testProductListingsPage() {
		pl = new ProductListingsPage(driver);
		pl.clickOnTshirtMenuTab();
		pl.moveToFirstProductAndClickOnAddToCart();
		Assert.assertEquals(pl.getSuccessMessage().trim(), Utilities.getProperty("successMessage"),
				"Add Product Success message is incorrect !! ");
		pl.clickOnContinueShopping();

	}

}
