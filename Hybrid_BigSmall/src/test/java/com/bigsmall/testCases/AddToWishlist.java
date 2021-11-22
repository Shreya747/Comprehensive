package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.addToWishlistPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.GetProperties;

public class AddToWishlist extends BaseClass {
	public static Logger log = LogManager.getLogger(AddToWishlist.class.getName());
	GetProperties prop = new GetProperties();



	@Test
	public void addToWishlist() {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		addToWishlistPOM pom = new addToWishlistPOM(driver);
		log.info("Click on Top50 from navigation bar");
		test.info("Click on Top50 from navigation bar");
		pom.getTop50().click();
		log.info("Choose the product from the result");
		test.info("Choose the product from the result");
		pom.getProduct().click();
		log.info("Add product to wishlist");
		test.info("Add product to wishlist");
		pom.getAddtoWishlist().click();
		log.info("Product wishlisted");
		test.info("Product wishlisted");
		log.info("Click on wishlist icon from header section");
		test.info("Click on wishlist icon from header section");
		pom.getWishlist().click();
		log.info("Continue wishlist");
		test.info("Continue wishlist");
		pom.getContinueWishlist().click();
		log.info("Move wishlisted product to cart");
		test.info("Move wishlisted product to cart");
		pom.getAddToCart().click();
		log.info("Product wishlisted and moved to cart");
		test.info("Product wishlisted and moved to cart");
	}

}
