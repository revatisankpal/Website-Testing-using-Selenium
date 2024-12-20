package com.tka.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tka.utilities.SeleniumUtilities;
import com.tka.utilitiesprop.PropUtil;

public class DashboardTestCases {
	@Test(priority = 1)
	public void testPageTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver, "/html/body/div/div[1]/section[1]/h1");
		String expresult = "Dashboard";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void checkSeleniumbox() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[1]");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void checkSeleniumPDFopen() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[1]/div/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testSeleniumTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3");
		String expresult = "SELENIUM";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void testTestingTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/p");
		String expresult = "Automation Testing";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void checkJavabox() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[2]");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void checkJavaPDFopen() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[1]/div/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testJavaTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3");
		String expresult = "JAVA";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void testJavaSubTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/p");
		String expresult = "Software Development";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void checkPythonbox() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[3]");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void checkPythonPDFopen() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[3]/div/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testPythonTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3");
		String expresult = "PYTHON";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void testPythonSubTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/p");
		String expresult = "Data Science";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void checkPhpbox() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[4]");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void checkPhpPDFopen() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div[4]/div/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testPhpTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3");
		String expresult = "PHP";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void testPhpSubTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/p");
		String expresult = "Web Development";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		
	}
	@Test
	public void checkJavaByKiranwebsiteOpen() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("DashboardURL"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/footer/strong/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}

}
