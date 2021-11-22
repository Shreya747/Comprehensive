package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.ClickLogoPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.GetProperties;

public class ClickLogoTC extends BaseClass {
	public static Logger log = LogManager.getLogger(ClickLogoTC.class.getName());
	GetProperties prop = new GetProperties();

	

	@Test
	public void HomePage() {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		ClickLogoPOM pom = new ClickLogoPOM(driver);
		log.info("Click on 'All of it' from the navigation bar");
		test.info("Click on 'All of it' from the navigation bar");
		pom.getAllofIt().click();
		log.info("Select the Product from Search results");
		test.info("Select the Product from Search results");
		pom.getFirstProduct().click();
		log.info("Checking the functionality of logo, After clicking logo navigate to Home page");
		test.info("Checking the functionality of logo, After clicking logo navigate to Home page");
		log.info("Validating weather logo is visible or not");
		test.info("Validating weather logo is visible or not");
		if (pom.getHomePage().isDisplayed() == true) {
			log.info("Logo is Available on current page");
			test.info("Logo is Available on current page");
		} else {
			log.info("Logo is Not-Available on current page");
			test.info("Logo is Not-Available on current page");
		}
		log.info("Click on Logo");
		test.info("Click on Logo");
		pom.getHomePage().click();
		log.info("User navigated back to Homepage from Product Details page");
		test.info("User navigated back to Homepage from Product Details page");
	}

	
}
