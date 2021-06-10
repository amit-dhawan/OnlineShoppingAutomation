package com.qurateassignment.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private static WebDriver driver;

	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signInBtn;

	@FindBy(xpath = "//img[contains(@src,'sale70.png')]")
	private WebElement homePageHeaderImg;

	@FindBy(id = "search_query_top")
	private WebElement searchBar;

	@FindBy(xpath = "//div[@id='contact-link']/following::span/strong")
	private WebElement phoneNumText;

	@FindBy(css = "div[id=contact-link]>a")
	private WebElement contactUsLink;

	@FindBys({ @FindBy(xpath = "//a[@title='Dresses']") })
	private List<WebElement> dressesMenuTabElementList;

	public boolean isUserNotLoggedIn() {
		boolean flag = false;
		if (signInBtn.getText().trim().equals("Sign in")) {
			flag = true;
		}
		return flag;
	}

	public boolean isHeaderPresent() {
		return homePageHeaderImg.isDisplayed();
	}

	public String getSearchBarPlaceHolderText() {
		return searchBar.getAttribute("placeholder");
	}

	public String getPhoneNumText() {
		return phoneNumText.getText();
	}

	public String getContactUsToolTipTxt() {
		return contactUsLink.getAttribute("title");
	}

	public boolean isMenuBarDressesTabPresent() {

		for (WebElement e : dressesMenuTabElementList)
			if (e.isDisplayed()) {
				return true;
			}

		return false;
	}
}
