package com.web.googlesearch.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.web.googlesearch.utilities.Functions;

public class GoogleHome  extends PageObject {	

	WebDriverWait wait=new WebDriverWait(driver, 20);
	Functions function = new Functions(driver);
	int i=0;
	
	@FindBy(name="q") 
	private WebElement txtSearch;
	

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
	
	public void clickSecondSearchResultLink() {		
		List <WebElement> my_list = driver.findElements(By.xpath("//div[@class=\"g\"]//h3/a[not(ancestor::div[@class=\"_OKe\"])]")); 
		System.out.println("List of Search Results");
		
		for (WebElement item:my_list) { 
			System.out.println("Link : " + ++i +": " + item.getAttribute("href")); 
			} 
		
		function.clickElement(my_list.get(2));
		System.out.println("Clicking 2nd Result : Completed");

	}

}

