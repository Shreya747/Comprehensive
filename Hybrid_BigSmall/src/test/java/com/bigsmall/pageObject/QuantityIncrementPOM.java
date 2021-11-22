package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.QuantityIncrementUI;

public class QuantityIncrementPOM extends QuantityIncrementUI {
	public WebDriver driver;

	public QuantityIncrementPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSantaGifts() {
		return driver.findElement(santaGifts);
	}
	public WebElement getProduct() {
		return driver.findElement(selectProduct);
	}
	public WebElement getQty() {
		return driver.findElement(QtyPlus);
	}
	public WebElement getAddToCart() {
		return driver.findElement(addtoCart);
	}
}
