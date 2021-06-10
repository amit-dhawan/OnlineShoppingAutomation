package com.qurateassignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummaryPage {

	private static WebDriver driver;

	public CartSummaryPage(WebDriver driver) {
		CartSummaryPage.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cartBtn;

	@FindBy(xpath = "//a[@title='View my shopping cart']/span[@class='ajax_cart_quantity']")
	WebElement cartQuantity;

	public void clickOnCartBtn() {
		cartBtn.click();
	}

	public int getTotalCartQuantity() {

		return Integer.parseInt(cartQuantity.getText());

	}
}
