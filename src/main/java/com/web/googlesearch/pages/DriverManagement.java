package com.web.googlesearch.pages;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DriverManagement {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp(){
		driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown(){
		driver.quit();
	}
}

