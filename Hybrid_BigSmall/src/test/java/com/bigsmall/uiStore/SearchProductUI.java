package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class SearchProductUI {

	public By searchBox = By.xpath("//input[@name='q']");
	public By selectProduct = By.xpath("//span[@class='snize-title']");	
	public By productName = By.xpath("//h1[@class='h1 product-single__title']");

}
