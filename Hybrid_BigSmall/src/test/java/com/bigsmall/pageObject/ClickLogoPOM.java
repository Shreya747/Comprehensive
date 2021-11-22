package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.ClickLogoUI;

public class ClickLogoPOM extends ClickLogoUI {
	public WebDriver driver;

	public ClickLogoPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAllofIt() {
		return driver.findElement(clickAllOfIt);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(selectFirstProduct);
	}

	public WebElement getHomePage() {
		return driver.findElement(backToHomePage);
	}

}
