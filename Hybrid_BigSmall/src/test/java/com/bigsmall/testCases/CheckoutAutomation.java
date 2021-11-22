package com.bigsmall.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bigsmall.pageObject.BuyProductPOM;
import com.bigsmall.utility.BaseClass;
import com.bigsmall.utility.ExcelInitialization;
import com.bigsmall.utility.GetProperties;

public class CheckoutAutomation extends BaseClass {
	public static Logger log = LogManager.getLogger(CheckoutAutomation.class.getName());
	GetProperties prop = new GetProperties();



	@Test(dataProvider = "getDeliveryDetails")
	public void checkoutAutomation(String search, String email, String fName, String lName, String address,
			String landmark, String city, int state, String pincode, String phoneNo) throws InterruptedException {
		driver.get(prop.getURL());
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
		BuyProductPOM obj = new BuyProductPOM(driver);
		log.info("Select the product from search results to buy");
		test.info("Select the product from search results to buy");
		obj.getclickSearchBar().sendKeys(search, Keys.ARROW_DOWN, Keys.ENTER);
		log.info("Search product by entering product related name in search bar");
		test.info("Search product by entering product related name in search bar");
		log.info("Open the selected product");
		test.info("Open the selected product");
		obj.getFirstProduct().click();
		log.info("Add the product to cart");
		test.info("Add the product to cart");
		obj.getCart().click();
		log.info("Go to checkout after adding to cart");
		test.info("Go to checkout after adding to cart");
		obj.getCheckout().click();
		log.info("Cut the popup of Whatsapp");
		test.info("Cut the popup of Whatsapp");
		obj.getWhatsapp().click();
		log.info("Fill the delivery details with respective fields");
		test.info("Fill the delivery details with respective fields");
		obj.getEmail().sendKeys(email);
		obj.getFirstNmae().sendKeys(fName);
		obj.getLastNmae().sendKeys(lName);
		obj.getAddress().sendKeys(address);
		obj.getLandmark().sendKeys(landmark);
		obj.getCity().sendKeys(city);
		Select sel = new Select(obj.getState());
		sel.selectByIndex(22);
		obj.getPinCode().sendKeys(pincode,Keys.BACK_SPACE, Keys.BACK_SPACE);
		obj.getPhoneNo().sendKeys(phoneNo,Keys.BACK_SPACE, Keys.BACK_SPACE);
		log.info("Delivery details filled");
		test.info("Delivery details filled");
		log.info("Click on continue shipping");
		test.info("Click on continue shipping");
		obj.getContinueShipping().sendKeys(Keys.ENTER);
		log.info("buying process completed");
		test.info("buying process completed");
	}

	// Data Provider to insert Buying product Details
	@DataProvider
	public Object[][] getDeliveryDetails() {
		ExcelInitialization exe = new ExcelInitialization(prop.getExcelPath(), prop.getExcelName());
		Object[][] objData = new Object[1][10];
		objData[0][0] = exe.getData(5, 1);
		objData[0][1] = exe.getData(10, 1);
		objData[0][2] = exe.getData(11, 1);
		objData[0][3] = exe.getData(12, 1);
		objData[0][4] = exe.getData(13, 1);
		objData[0][5] = exe.getData(14, 1);
		objData[0][6] = exe.getData(15, 1);
		objData[0][7] = exe.getData(16, 1);
		objData[0][8] = exe.getData(17, 1);
		objData[0][9] = exe.getData(18, 1);
		return objData;
	}
		
}
