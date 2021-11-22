package com.bigsmall.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GetProperties {
	public Properties prop;

	public GetProperties() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\M1072987\\eclipse-workspace\\Hybrid_BigSmall\\src\\test\\resources\\config.properties");
			prop.load(fis);

		} catch (FileNotFoundException e) {

			System.out.println("File not Found!");

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getBrowserName() {
		String browserName = prop.getProperty("browserName");
		return browserName;
	}

	public String getURL() {
		String url = prop.getProperty("url");
		return url;
	}

	public String getDriverPath() {
		String path = prop.getProperty("driverPath");
		return path;
	}

	public String getExcelPath() {
		String exlpath = prop.getProperty("excelPath");
		return exlpath;
	}

	public String getExcelName() {
		String exlName = prop.getProperty("excelSheetName");
		return exlName;
	}
}
