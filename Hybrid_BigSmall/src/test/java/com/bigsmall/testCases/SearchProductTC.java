package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.SearchProductPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.ExcelInitialization;
import com.bigsmall.utility.GetProperties;

public class SearchProductTC extends BaseClass {
	public static Logger log = LogManager.getLogger(SearchProductTC.class.getName());
	GetProperties prop = new GetProperties();



	@Test(dataProvider = "getSearchData")
	public void searchProduct(String searchData) {

		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		driver.get(prop.getURL());
		SearchProductPOM pom = new SearchProductPOM(driver);
		log.info("Search for some product inputting keys from keyboard in search bar");
		log.info("Inputting 'pocket wa' and getting keyword from dropdown suggestions");
		test.info("Search for some product inputting keys from keyboard in search bar");
		test.info("Inputting 'pocket wa' and getting keyword from dropdown suggestions");
		pom.getSearchBar().sendKeys(searchData, Keys.ARROW_DOWN, Keys.ENTER);// Searching for pocket watch and
		log.info("Navigated to search result page");
		test.info("Navigated to search result page");
		log.info("Selecting the product from search result page");
		test.info("Selecting the product from search result page");
		String productName1 = pom.getProduct().getText();
		log.info("Product Selected and Navigated to Product details page");
		test.info("Product Selected and Navigated to Product details page");
		pom.getProduct().click();
		String productName2 = pom.getTitle().getText();

		try {
			Assert.assertEquals(productName2, "na");
			log.info("Product name matched");
			test.info("Product name matched");

		} catch (AssertionError e) {
			log.error("Product name not matched");
			test.fail("Product name not matched");
		}

	}

	@DataProvider
	public Object[][] getSearchData() {
		ExcelInitialization exe = new ExcelInitialization(prop.getExcelPath(), prop.getExcelName());
		Object[][] objData = new Object[1][1];
		objData[0][0] = exe.getData(4, 1);
		return objData;
	}

}
