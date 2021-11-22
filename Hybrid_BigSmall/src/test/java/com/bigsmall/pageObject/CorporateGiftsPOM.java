package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.CorporateGiftsUI;

public class CorporateGiftsPOM extends CorporateGiftsUI {
	public WebDriver driver;

	public CorporateGiftsPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCorporategifts() {
		return driver.findElement(clickCorporateGifts);
	}

	public WebElement getName() {
		return driver.findElement(fillName);
	}

	public WebElement getEmail() {
		return driver.findElement(fillEmail);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(fillPhoneNo);
	}

	public WebElement getEnquiry() {
		return driver.findElement(fillEnquiry);
	}

	public WebElement getSubmit() {
		return driver.findElement(clcikSubmit);
	}

}
