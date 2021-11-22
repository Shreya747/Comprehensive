package com.bigsmall.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	static ExtentReports report;

	public static ExtentReports extentReportfun() {
		String path = System.getProperty("user.dir") + "\\ProjectReports\\TestReport.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setReportName("Automation Testing Report for BigSmall.in");
		spark.config().setDocumentTitle("Test Outcomes");
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Tester", "Shreya");
		return report;

	}

	
}
