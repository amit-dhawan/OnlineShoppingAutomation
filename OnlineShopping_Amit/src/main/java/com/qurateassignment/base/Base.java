package com.qurateassignment.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qurateassignment.utilities.Utilities;

public class Base {

	public static WebDriver driver;
	private final String CHROMEDRIVER_NAME = "webdriver.chrome.driver";
	private final String CHROMEDRIVER_PATH = System.getProperty("user.dir").concat(File.separator).concat("resources")
			.concat(File.separator).concat("drivers").concat(File.separator).concat("chromedriver");

	@BeforeSuite
	public void initialize() {
		System.setProperty(CHROMEDRIVER_NAME, CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utilities.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void cleanUp() {
		if (driver != null) {
			driver.quit();
		}
	}

}
