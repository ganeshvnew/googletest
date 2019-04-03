package com.web.googlesearch.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.web.googlesearch.pages.PageObject;

public class Functions extends PageObject {

	WebDriverWait wait=new WebDriverWait(driver, 20);


	public Functions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clearTextBox(WebElement element) {

		try {
			element.clear();
		}

		catch(Exception e) {
			System.out.println(e);
		}

	}

	public void typeText(WebElement element, String Text) {

		try {
			element.sendKeys(Text);
		}

		catch(Exception e) {
			System.out.println(e);
		}

	}

	public void sendSpecialKeys(WebElement element, Keys key) {

		try {
			element.sendKeys(key);
		}

		catch(Exception e) {
			System.out.println(e);
		}

	}

	public void clickElement(WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}

		catch(Exception e) {
			System.out.println(e);
		}

	}




}
