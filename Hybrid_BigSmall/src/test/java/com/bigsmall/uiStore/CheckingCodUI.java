package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class CheckingCodUI {
	public By selectNew = By.xpath("//ul[@class='site-nav site-navigation small--hide']/li[3]");
	public By selectFirstProduct = By.xpath("//div[@class='grid-product__content']");
	public By inputPinCode = By.xpath("//input[@id='PostalCode']");
	public By clickCheckPin = By.xpath("//button[@class='codbutton btn button']");
	public By checkCOD = By.xpath("//p[@id='PostalCodeCheckerAvailability']");

}
