package com.web.googlesearch.testcases;

import org.junit.Test;
import com.web.googlesearch.pages.DriverManagement;
import com.web.googlesearch.pages.GoogleHome;

public class GoogleSearch extends DriverManagement {

	@Test
	public void searchTextInGoogle(){
		
		GoogleHome google = new GoogleHome(driver);

		//Enter the KeyWord to search
		google.typeSearchKeyWord("SQL");
		
		//Perform SearchOperation
		google.performSearch();
		
		//Click the Second Result from the search
		google.clickSecondSearchResultLink();

	}
}

