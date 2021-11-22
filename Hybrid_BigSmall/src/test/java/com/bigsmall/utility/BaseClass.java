package com.bigsmall.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	// public ExtentReports extent = ExtentReport.extentReportfun();
	@BeforeTest
	public WebDriver initializeBrowser() {

		GetProperties propObj = new GetProperties();
		try {
			String browserName = propObj.getBrowserName();
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", propObj.getDriverPath());
				driver = new ChromeDriver();
			} else if (browserName.equals("edge")) {

				System.setProperty("webdriver.edge.driver", propObj.getDriverPath());
				driver = new EdgeDriver();
			} else {
				System.out.println("No browser Driver Specified for " + browserName);
			}

			// Implicit wait to avoid element not found exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Maximize browser
			driver.manage().window().maximize();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return driver;

	}

	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

}
