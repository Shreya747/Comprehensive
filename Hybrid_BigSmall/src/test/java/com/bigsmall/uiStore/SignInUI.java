package com.bigsmall.uiStore;

import org.openqa.selenium.By;

public class SignInUI {
	public By signinButton = By.xpath("//a[@class='site-nav__link site-nav__link--icon signinlink']");
	public By email = By.xpath("//input[@id='CustomerEmail']");
	public By password = By.xpath("//input[@id='CustomerPassword']");
	public By signin = By.xpath("//input[@value='Sign In']");
}
