package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class GiftCardUI {
	public By clickGiftCard = By.xpath("//a[@class='site-nav__link site-nav__link--icon giftcardlink']");
	public By selectAmount = By.xpath("//label[@for='ProductSelect-738195636312-option-title-Rs.+1000']");
	public By addToCart = By.xpath("//button[@class='btn btn--full add-to-cart spice-submit-button']");
}
