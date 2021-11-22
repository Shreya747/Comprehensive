package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.QuantityIncrementPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.GetProperties;

public class QtyIncrement extends BaseClass {
	public static Logger log = LogManager.getLogger(QtyIncrement.class.getName());
	GetProperties prop = new GetProperties();



	@Test
	public void qtyIncrement() {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		QuantityIncrementPOM pom = new QuantityIncrementPOM(driver);
		log.info("Select Santa gift From navigation bar");
		test.info("Select Santa gift From navigation bar");
		pom.getSantaGifts().click();
		log.info("Result for Santa gift will be displayed");
		test.info("Result for Santa gift will be displayed");
		pom.getProduct().click();
		log.info("Select the product");
		test.info("Select the product");
		log.info("Increment the quantity of product");
		test.info("Increment the quantity of product");
		pom.getQty().click();
		log.info("Quantity incremented from one to two");
		test.info("Quantity incremented from one to two");
		log.info("Add this product to cart");
		test.info("Add this product to cart");
		pom.getAddToCart().click();
		log.info("Product added to cart");
		test.info("Product added to cart");
	}

}
