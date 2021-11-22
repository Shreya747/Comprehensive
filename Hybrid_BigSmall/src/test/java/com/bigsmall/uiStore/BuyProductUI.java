package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class BuyProductUI {
	public By searchBar = By.xpath("//input[@name='q']");
	public By selectFirstProduct = By.xpath("//span[@class='snize-overhidden']");
	public By addToCart = By.xpath("//button[@class='btn btn--full add-to-cart spice-submit-button']");
	public By addGiftWrap = By.xpath("//input[@id='gift-wrapping']");
	public By addGiftNote = By.xpath("//input[@id='cart-notes']");
	public By fillForm = By.xpath("//input[@id='from']");
	public By fillTo = By.xpath("//input[@id='to']");
	public By fillMessage = By.xpath("//input[@id='gift-card']");
	public By clickGoToCheckout = By.xpath("//button[@name='checkout']");
	public By cutWhatsapp = By.xpath("//img[@class='wa-optin-widget-close-img']");
	public By fillEmail = By.xpath("//input[@id='checkout_email']");
	public By fillFirstName = By.xpath("//input[@id='checkout_shipping_address_first_name']");
	public By fillLastName = By.xpath("//input[@id='checkout_shipping_address_last_name']");
	public By fillAddress = By.xpath("//input[@id='checkout_shipping_address_address1']");
	public By fillLandmark = By.xpath("//input[@id='checkout_shipping_address_address2']");
	public By fillCity = By.xpath("//input[@id='checkout_shipping_address_city']");
	public By selectState = By.xpath("//select[@id='checkout_shipping_address_province']");
	public By fillPinCode = By.xpath("//input[@id='checkout_shipping_address_zip']");
	public By fillPhoneNo = By.xpath("//input[@id='checkout_shipping_address_phone']");
	public By clickContinueShipping = By.xpath("//button[@id='continue_button']");
}
