package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class addToWishlistUI {
	public By top50 = By.xpath("//ul[@class='site-nav site-navigation small--hide']/li[6]");
	public By selectProduct = By.xpath("//div[@class='grid-product__title']");
	public By addToWishlist = By.xpath("//button[@aria-label='Add to Wishlist']");
	public By selectWishlist = By.xpath("//a[@class='site-nav__link site-nav__link--icon swym-wishlist wishlistlink']");
	public By continueWishlist = By.xpath("//button[@id='swym-welcome-button']");
	public By addToCart = By.xpath("//div[@class='swym-outer']//a[@href='#']");
}
