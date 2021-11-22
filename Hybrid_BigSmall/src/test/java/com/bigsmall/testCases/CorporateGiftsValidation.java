package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.CorporateGiftsPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.ExcelInitialization;
import com.bigsmall.utility.GetProperties;

public class CorporateGiftsValidation extends BaseClass {
	public static Logger log = LogManager.getLogger(CorporateGiftsValidation.class.getName());
	GetProperties prop = new GetProperties();

	

	@Test(dataProvider = "getData")
	public void corporateGifts(String name, String email, String phoneNo, String enquiry) throws InterruptedException {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		CorporateGiftsPOM pom = new CorporateGiftsPOM(driver);
		log.info("Select corporate gifts from navigation bar");
		test.info("Select corporate gifts from navigation bar");
		pom.getCorporategifts().click();
		log.info("Form will Open for inquiry after navigation to Corporate Gifts");
		test.info("Form will Open for inquiry after navigation to Corporate Gifts");
		log.info("Fill the form with respective fields");
		log.info("Input Name");
		test.info("Fill the form with respective fields");
		test.info("Input Name");
		pom.getName().sendKeys(name);
		log.info("Input email-id");
		test.info("Input email-id");
		pom.getEmail().sendKeys(email);
		log.info("Input Phone number");
		test.info("Input Phone number");
		pom.getPhoneNo().sendKeys(phoneNo);
		log.info("Input Message for inquiry");
		test.info("Input Message for inquiry");
		pom.getEnquiry().sendKeys(enquiry);
		pom.getSubmit().click();

	}

	@DataProvider
	public Object[][] getData() {
		ExcelInitialization exe = new ExcelInitialization(prop.getExcelPath(), prop.getExcelName());
		Object[][] objData = new Object[1][4]; 
		objData[0][0] = exe.getData(21, 1);
		objData[0][1] = exe.getData(22, 1);;
		objData[0][2] = exe.getData(23, 1);;
		objData[0][3] = exe.getData(24, 1);;
		return objData;
	}

}
