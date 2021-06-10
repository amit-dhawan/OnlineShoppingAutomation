package com.qurateassignment.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListingsPage {
	private static WebDriver driver;

	public ProductListingsPage(WebDriver driver) {
		ProductListingsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(xpath = "//a[@title='T-shirts']") })
	List<WebElement> tShirtsTabList;

	@FindBys({ @FindBy(xpath = "//form[@method=\"post\"]") })
	List<WebElement> compareToBtnList;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]/div")
	WebElement firstProductTShirt;

	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement addToCartBtn;

	@FindBy(xpath = "//span[@title='Close window']/following::h2")
	WebElement addProductSuccessMsg;

	@FindBy(xpath = "//span[@title='Continue shopping']/span")
	WebElement continueShoppingBtn;

	public void clickOnTshirtMenuTab() {
		for (WebElement e : tShirtsTabList) {
			if (e.isDisplayed()) {
				e.click();
			}
		}
	}

	public boolean isCompareBtnPresent() {
		if (compareToBtnList.get(0).isDisplayed() && compareToBtnList.get(1).isDisplayed()) {
			return true;
		}
		return false;
	}

	public void moveToFirstProduct() {
		Actions action = new Actions(driver);
		action.moveToElement(firstProductTShirt).build().perform();

	}

	public void clickOnAddToCartFirstProduct() {

		addToCartBtn.click();
	}

	public void moveToFirstProductAndClickOnAddToCart() {

		moveToFirstProduct();
		clickOnAddToCartFirstProduct();
	}

	public String getSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(addProductSuccessMsg));
		return addProductSuccessMsg.getText().trim();

	}

	public void clickOnContinueShopping() {
		continueShoppingBtn.click();
	}

}
