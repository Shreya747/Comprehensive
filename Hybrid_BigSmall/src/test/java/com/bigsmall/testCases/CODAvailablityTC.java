package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.ChekingCodPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.ExcelInitialization;
import com.bigsmall.utility.GetProperties;

public class CODAvailablityTC extends BaseClass {
	public static Logger log = LogManager.getLogger(CODAvailablityTC.class.getName());
	GetProperties prop = new GetProperties();

	

	@Test(dataProvider = "Pin")
	public void pinCodeValidation(String pincode) throws InterruptedException {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		ChekingCodPOM obj = new ChekingCodPOM(driver);
		log.info("Click New from Navigation bar");
		test.info("Click New from Navigation bar");
		obj.getNew().click();
		log.info("Select the product");
		test.info("Select the product");
		obj.getProduct().click();
		log.info("On navigated Product details page");
		test.info("On navigated Product details page");
		log.info("Input the pincode for selected product");
		test.info("Input the pincode for selected product");
		obj.getPin().sendKeys(pincode, Keys.BACK_SPACE, Keys.BACK_SPACE);
		log.info("Check the COD available for inputed pin code");
		test.info("Check the COD available for inputed pin code");
		obj.getCheckPin().click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		log.info("Check the COD available Message");
		test.info("Check the COD available Message");
		wait.until(ExpectedConditions.visibilityOf(obj.getMessage()));
		String msg = obj.getMessage().getText();
		try {
			Assert.assertEquals(msg, "Cash on Delivery is available.");
			log.info("COD Available for inputed pin code");
			test.info("COD Available for inputed pin code");
		} catch (AssertionError e) {
			log.error("COD Unavailable for inputed pin code");
			test.fail("COD Unavailable for inputed pin code");
		}

	}

	@DataProvider
	public Object[][] Pin() {
		ExcelInitialization exe = new ExcelInitialization(prop.getExcelPath(), prop.getExcelName());
		Object[][] objData = new Object[2][1];
		objData[0][0] = exe.getData(27, 1);
		objData[1][0] = exe.getData(28, 1);
		return objData;
	}
	
}