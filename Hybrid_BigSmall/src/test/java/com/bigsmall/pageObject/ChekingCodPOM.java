package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.CheckingCodUI;

public class ChekingCodPOM extends CheckingCodUI {
	public WebDriver driver;

	public ChekingCodPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNew() {
		return driver.findElement(selectNew);
	}

	public WebElement getProduct() {
		return driver.findElement(selectFirstProduct);
	}

	public WebElement getPin() {
		return driver.findElement(inputPinCode);
	}

	public WebElement getCheckPin() {
		return driver.findElement(clickCheckPin);
	}

	public WebElement getMessage() {
		return driver.findElement(checkCOD);
	}

}
