package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.SearchProductUI;

public class SearchProductPOM extends SearchProductUI {
	WebDriver driver;

	public SearchProductPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBar() {
		return driver.findElement(searchBox);
	}

	public WebElement getProduct() {
		return driver.findElement(selectProduct);
	}

	public WebElement getTitle() {
		return driver.findElement(productName);
	}
}
