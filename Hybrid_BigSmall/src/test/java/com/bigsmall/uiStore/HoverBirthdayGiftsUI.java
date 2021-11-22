package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class HoverBirthdayGiftsUI {
	public By hoverBday=By.xpath("//ul[@class='site-nav site-navigation small--hide']/li[10]");
	public By selectOpt=By.xpath("//ul[@class='site-nav site-navigation small--hide']/li[10]//ul/li[7]");
	public By selectProduct=By.xpath("//div[@class='grid-product__content']//div[@class='grid-product__title']");
	public By selectProductOption=By.xpath("//fieldset[@name='Design']/div[3]");
	public By addToCart=By.xpath("//button[@name='add']");
}
