package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.BuyProductUI;

public class BuyProductPOM extends BuyProductUI {
	public WebDriver driver;

	public BuyProductPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getclickSearchBar() {
		return driver.findElement(searchBar);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(selectFirstProduct);
	}

	public WebElement getCart() {
		return driver.findElement(addToCart);
	}

	public WebElement getGiftWrap() {
		return driver.findElement(addGiftWrap);
	}

	public WebElement getGiftNote() {
		return driver.findElement(addGiftNote);
	}

	public WebElement getForm() {
		return driver.findElement(fillForm);
	}

	public WebElement getTo() {
		return driver.findElement(fillTo);
	}

	public WebElement getMessage() {
		return driver.findElement(fillMessage);
	}

	public WebElement getCheckout() {
		return driver.findElement(clickGoToCheckout);
	}

	public WebElement getWhatsapp() {
		return driver.findElement(cutWhatsapp);
	}

	public WebElement getEmail() {
		return driver.findElement(fillEmail);
	}

	public WebElement getFirstNmae() {
		return driver.findElement(fillFirstName);
	}

	public WebElement getLastNmae() {
		return driver.findElement(fillLastName);
	}

	public WebElement getAddress() {
		return driver.findElement(fillAddress);
	}

	public WebElement getLandmark() {
		return driver.findElement(fillLandmark);
	}

	public WebElement getCity() {
		return driver.findElement(fillCity);
	}

	public WebElement getState() {
		return driver.findElement(selectState);
	}

	public WebElement getPinCode() {
		return driver.findElement(fillPinCode);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(fillPhoneNo);
	}

	public WebElement getContinueShipping() {
		return driver.findElement(clickContinueShipping);
	}

}
