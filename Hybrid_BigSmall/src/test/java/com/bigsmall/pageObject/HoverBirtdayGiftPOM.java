package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.HoverBirthdayGiftsUI;

public class HoverBirtdayGiftPOM extends HoverBirthdayGiftsUI {
	public WebDriver driver;

	public HoverBirtdayGiftPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBirthdayGifts() {
		return driver.findElement(hoverBday);
	}

	public WebElement getOptionDropdown() {
		return driver.findElement(selectOpt);
	}

	public WebElement getProduct() {
		return driver.findElement(selectProduct);
	}

	public WebElement getProductVariety() {
		return driver.findElement(selectProductOption);
	}

	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
}
