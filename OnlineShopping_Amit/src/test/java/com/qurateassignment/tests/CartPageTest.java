package com.qurateassignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qurateassignment.base.Base;
import com.qurateassignment.pages.CartSummaryPage;
import com.qurateassignment.utilities.Utilities;

public class CartPageTest extends Base {

	private CartSummaryPage cp;

	@Test(description = "validate cart count", priority = 3)
	public void cartSummartTest() {

		cp = new CartSummaryPage(driver);
		cp.clickOnCartBtn();
		Assert.assertEquals(cp.getTotalCartQuantity(), Integer.parseInt(Utilities.getProperty("quantity")),
				"Cart quantitiy is not correct");
		System.out.println("Total quantitiy in cart is: " + cp.getTotalCartQuantity());

	}

}
