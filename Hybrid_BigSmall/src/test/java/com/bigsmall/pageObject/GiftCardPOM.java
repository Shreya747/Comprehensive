package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.GiftCardUI;

public class GiftCardPOM extends GiftCardUI {
	public WebDriver driver;

	public GiftCardPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGiftCard() {
		return driver.findElement(clickGiftCard);
	}

	public WebElement getAmount() {
		return driver.findElement(selectAmount);
	}

	public WebElement getCart() {
		return driver.findElement(addToCart);
	}

}
