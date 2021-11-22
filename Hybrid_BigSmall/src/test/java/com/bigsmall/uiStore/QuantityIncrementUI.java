package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class QuantityIncrementUI {
	public By santaGifts = By.xpath("//a[@data-dropdown-rel='secret-santa-gifts']");
	public By selectProduct = By.xpath("//div[@id='CollectionAjaxContent']//div[@class='grid-product__meta']");
	public By QtyPlus = By.xpath("//div[@class='quantitybox']/div/span");
	public By addtoCart=By.xpath("//button[@class='btn btn--full add-to-cart spice-submit-button']");
}
