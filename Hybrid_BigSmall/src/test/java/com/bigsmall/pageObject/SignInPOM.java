package com.bigsmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.uiStore.SignInUI;

public class SignInPOM extends SignInUI {
	public WebDriver driver;

	
	public SignInPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignInButton() {
		return driver.findElement(signinButton);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getSignIn() {
		return driver.findElement(signin);
	}

}
