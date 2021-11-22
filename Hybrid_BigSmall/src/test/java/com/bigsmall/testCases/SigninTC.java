package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.SignInPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.ExcelInitialization;
import com.bigsmall.utility.GetProperties;

public class SigninTC extends BaseClass {
	public static Logger log = LogManager.getLogger(SigninTC.class.getName());
	GetProperties prop = new GetProperties();

	// Signup testCase:
	@Test(dataProvider = "getData")
	public void signIn(String username, String password) throws InterruptedException {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		SignInPOM pom = new SignInPOM(driver);
		log.info("User Landed to Landing page");
		test.info("User Landed to Landing page");
		log.info("Click on Signin Button from header");
		test.info("Click on Signin Button from header");
		pom.getSignInButton().click();
		log.info("Opening Signin Form");
		test.info("Opening Signin Form");
		log.info("Input email in username field");
		test.info("Input email in username field");
		pom.getEmail().sendKeys(username);
		log.info("Input password in password field");
		test.info("Input password in password field");
		pom.getPassword().sendKeys(password);
		log.info("Signing Inn with credentials");
		test.info("Signing Inn with credentials");
		pom.getSignIn().click();
		log.info("SignedIn Sucessfull!!");
		test.info("SignedIn Sucessfull!!");

	}

	// Data Provider to insert data for Signin.
	@DataProvider
	public Object[][] getData() {
		ExcelInitialization exe = new ExcelInitialization(prop.getExcelPath(), prop.getExcelName());
		Object[][] objData = new Object[1][2];
		objData[0][0] = exe.getData(1, 1);
		objData[0][1] = exe.getData(2, 1);
		return objData;
	}

	@AfterMethod
	public void teardown() {
		log.info("Browser Closed.");
		test.info("Browser Closed.");
//		extent.flush();
//		driver.close();

	}

}
