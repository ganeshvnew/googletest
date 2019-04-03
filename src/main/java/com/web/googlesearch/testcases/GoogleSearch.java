package com.web.googlesearch.testcases;

import org.junit.Test;

import com.web.googlesearch.pages.DriverManagement;
import com.web.googlesearch.pages.GoogleHome;

public class GoogleSearch extends DriverManagement {

	@Test
	public void searchTextInGoogle(){
		
		driver.get("http://www.google.com");
		
		GoogleHome googleHome = new GoogleHome(driver);

		googleHome.typeSearchKeyWord("SQL");
		googleHome.clickSearchButton();
		googleHome.clickSecondSearchResultLink();

	}
}

