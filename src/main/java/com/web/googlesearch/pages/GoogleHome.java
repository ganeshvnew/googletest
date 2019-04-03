package com.web.googlesearch.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.web.googlesearch.utilities.Functions;

public class GoogleHome  extends PageObject {	

	WebDriverWait wait=new WebDriverWait(driver, 20);
	Functions function = new Functions(driver);

	@FindBy(name="q")
	private WebElement txtSearch;

	@FindBy(xpath="//h3[contains(.,'SQL Tutorial - W3Schools')]")
	private WebElement linkSearchResult;


	public GoogleHome(WebDriver driver) {
		super(driver);
	}

	public void typeSearchKeyWord(String keyword){
		function.clearTextBox(txtSearch);
		function.typeText(txtSearch, keyword);

	}

	public void clickSearchButton() {
		function.sendSpecialKeys(txtSearch, Keys.TAB);
		function.sendSpecialKeys(txtSearch, Keys.TAB);
		function.sendSpecialKeys(txtSearch, Keys.RETURN);

	}


	public void clickSearchResult(){			
		function.clickElement(linkSearchResult);

	}			


}

