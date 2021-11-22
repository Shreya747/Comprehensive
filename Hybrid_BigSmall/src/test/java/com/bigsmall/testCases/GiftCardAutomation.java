package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.GiftCardPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.GetProperties;

public class GiftCardAutomation extends BaseClass {
	public static Logger log = LogManager.getLogger(GiftCardAutomation.class.getName());
	GetProperties prop = new GetProperties();



	@Test
	public void HomePage() {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		GiftCardPOM gc = new GiftCardPOM(driver);
		log.info("Select the gift from navigation bar.");
		test.info("Select the gift from navigation bar.");
		gc.getGiftCard().click();
		log.info("Popup will open for the gift card");
		test.info("Popup will open for the gift card");
		log.info("Select the amount for gift card");
		test.info("Select the amount for gift card");
		gc.getAmount().click();
		log.info("Adding gift card to cart");
		test.info("Adding gift card to cart");
		gc.getCart().click();
	}
	
}
