package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.addToWishlistUI;

public class addToWishlistPOM extends addToWishlistUI {
	public WebDriver driver;

	public addToWishlistPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTop50() {
		return driver.findElement(top50);
	}

	public WebElement getProduct() {
		return driver.findElement(selectProduct);
	}

	public WebElement getAddtoWishlist() {
		return driver.findElement(addToWishlist);
	}

	public WebElement getWishlist() {
		return driver.findElement(selectWishlist);
	}

	public WebElement getContinueWishlist() {
		return driver.findElement(continueWishlist);
	}

	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
}
