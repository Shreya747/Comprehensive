package com.bigsmall.utility;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Listeners extends BaseClass implements ITestListener {

	ExtentReports extent = ExtentReport.extentReportfun();
	public static Logger log = LogManager.getLogger(Listeners.class.getName());
	String pathSS = null;

	@Override
	public void onFinish(ITestContext context) {

		log.info("Browser Closed.");
		test.info("Browser Closed.");
		extent.flush();

	}

	public void onTestFailure(ITestResult result) {

		try {
			pathSS = Screenshot.capture("Screenshot captured");
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		test.fail(result.getTestName() + " Test Failed...!",
				MediaEntityBuilder.createScreenCaptureFromPath(pathSS).build());
		
	}

	public void onTestSuccess(ITestResult result) {

		try {
			pathSS = Screenshot.capture("Screenshot captured");
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		test.pass(result.getTestName() + " Test Passes...!",
				MediaEntityBuilder.createScreenCaptureFromPath(pathSS).build());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		log.info("Test Skipped");
		test.info("Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		log.info("Test Started");
		test.info("Test Started");
		log.info("Opening the browser");
		test.info("Opening the browser");

	}

	@Override
	public void onStart(ITestContext context) {

	}

}