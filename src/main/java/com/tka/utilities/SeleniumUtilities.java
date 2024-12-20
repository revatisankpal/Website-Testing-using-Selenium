package com.tka.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.tka.utilitiesprop.PropUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SeleniumUtilities {
	final static Logger logger = LogManager.getLogger(SeleniumUtilities.class);

//	public static WebDriver openBrowser() {
//		
//			WebDriver driver = new ChromeDriver();
//			return driver;
//		}
	public static WebDriver openBrowser()  {
		String brType = null;
		try {
			brType = PropUtil.valueOfAnyKey("adminmgmt.browsertype");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("received br name as  " + brType);
		if (brType.equals("ChromeDriver")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (brType.equals("safari")) {
			WebDriver driver = new SafariDriver();
			driver.manage().window().maximize();
			return driver;
		} else {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
	}

	public static void OpenANyUrl(WebDriver driver, String opUrl) {
		driver.get(opUrl);
	}
	public static void clearButton(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).clear();
	}

	public static void clickButton(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public static void quitButton(WebDriver driver) {
		driver.quit();
	}

	public static void enterText(WebDriver driver, String xpath, String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	public static String getAnyText(WebDriver driver, String xpath) {
		String txt = driver.findElement(By.xpath(xpath)).getText();
		return txt;
	}

}
