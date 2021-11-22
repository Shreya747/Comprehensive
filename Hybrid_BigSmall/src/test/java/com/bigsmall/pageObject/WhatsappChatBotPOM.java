package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.WhatsappChatBotUI;

public class WhatsappChatBotPOM extends WhatsappChatBotUI {
	public WebDriver driver;

	public WhatsappChatBotPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWhatsappIcon() {
		return driver.findElement(whatsappIcon);

	}
}
