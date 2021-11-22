package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.HoverBirtdayGiftPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.GetProperties;

public class HoverHeader extends BaseClass {
	public static Logger log = LogManager.getLogger(HoverHeader.class.getName());
	GetProperties prop = new GetProperties();


	@Test
	// Hover the Birthday-Gifts and select product.
	public void hoverHeader() {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		HoverBirtdayGiftPOM pom = new HoverBirtdayGiftPOM(driver);
		log.info("Hover mouse on Birthday gifts");
		test.info("Hover mouse on Birthday gifts");
		Actions act = new Actions(driver);
		WebElement ele = pom.getBirthdayGifts();
		act.moveToElement(ele).perform();
		log.info("Getting Dropdown for Birthday Gifts for");
		test.info("Getting Dropdown for Birthday Gifts for");
		log.info("Select /'Return Birthday gift'/ from Suggested dropdown");
		test.info("Select /'Return Birthday gift'/ from Suggested dropdown");
		pom.getOptionDropdown().click();
		log.info("User will get results for /'Return Birthday gifts'/.");
		test.info("User will get results for /'Return Birthday gifts'/.");
		log.info("Select the Gifting product");
		test.info("Select the Gifting product");
		pom.getProduct().click();
		log.info("Select variety of product");
		test.info("Select variety of product");
		pom.getProductVariety().click();
		log.info("Add selected product to cart");
		test.info("Add selected product to cart");
		pom.getAddToCart().click();
	}
	
}
