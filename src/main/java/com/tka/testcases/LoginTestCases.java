package com.tka.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tka.utilities.SeleniumUtilities;
import com.tka.utilitiesprop.PropUtil;
//import com.tka.utilitiesprop.PropUtil;

public class LoginTestCases {
	@Test(enabled = false)
	public void checkSubheadingText() throws Exception {
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = SeleniumUtilities.openBrowser();

		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));

		// driver.get("https://javabykiran.com/liveproject/pages/examples/logout.html");

		String actText = SeleniumUtilities.getAnyText(driver, "/html/body/div/div[2]/p[1]");
		String expText = "Sign in to start your session";// from BRD
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actText, expText);
	}

	@Test(enabled = true)
	public void checkSubHeading() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		String actText = SeleniumUtilities.getAnyText(driver, "//p[2]");
		String expText = "logout successfully ";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actText, expText);

	}

	@Test(enabled = true)
	public void checkmainHeading() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		String actText = SeleniumUtilities.getAnyText(driver, "//div[1]/a/b");
		String expText = "Java By Kiran";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actText, expText);

	}

	@Test(enabled = true)
	public void checkmainHeadingText() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		String actText = SeleniumUtilities.getAnyText(driver, "//div[1]/a/h4");
		String expText = "JAVA | SELENIUM | PYTHON";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actText, expText);

	}

	@Test(enabled = true)
	public void checkEmailText() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.clickButton(driver, "//div[2]/form/div[1]/input");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
	}

	@Test(enabled = true)
	public void checkPasswordTextbar() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.clickButton(driver, "//div[2]/form/div[2]/input");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
	}

	@Test(enabled = true)
	public void checkSigninButtonText() throws Exception {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
	}

	@Test(enabled = true)
	public void validCredetialsLoginpage() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.enterText(driver, "//*[@id=\"email\"]", "kiran@gmail.com");
		SeleniumUtilities.enterText(driver, "//*[@id=\"password\"]", "123456");
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		String Actresult = SeleniumUtilities.getAnyText(driver, "/html/body/div/header/a/span[2]/b");
		String Expresult = "Java By Kiran";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(Actresult, Expresult);

	}

	@Test
	public void checkBlackLoginpage() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		String Actresult = SeleniumUtilities.getAnyText(driver, "//*[@id=\"email_error\"]");
		String Expresult = "Please enter valid email and password";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(Actresult, Expresult);

	}

	@Test
	public void onlyEnterEmail() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.enterText(driver, "//*[@id=\"email\"]", "kiran@gmail.com");
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		String Actresult = SeleniumUtilities.getAnyText(driver, "//*[@id=\"password_error\"]");
		String Expresult = "Please enter password.";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(Actresult, Expresult);

	}

	@Test
	public void onlyEnterPassword() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.enterText(driver, "//*[@id=\"password\"]", "123456");
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		String Actresult = SeleniumUtilities.getAnyText(driver, "//*[@id=\"email_error\"]");
		String Expresult = "Please enter email";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(Actresult, Expresult);

	}

	@Test(dataProvider = "logindata")
	public void InvalidCredetialsloginpage(String email, String password) {
		System.out.println("Email>>>" + email);
		System.out.println("password>>>" + password);
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("mainURL"));
		SeleniumUtilities.clearButton(driver, "//*[@id=\"email\"]");
		SeleniumUtilities.clearButton(driver, "//*[@id=\"password\"]");
		SeleniumUtilities.enterText(driver, "//*[@id=\"email\"]", email);
		SeleniumUtilities.enterText(driver, "//*[@id=\"password\"]", password);
		SeleniumUtilities.clickButton(driver, "//*[@id=\"form\"]/div[3]/div/button");
		String actresult = SeleniumUtilities.getAnyText(driver, "//*[@id=\"form\"]");
		String expresult = "Please enter email as kiran@gmail.com\r\n" + "Please enter password 123456 Sign In";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);

	}

	@DataProvider
	public Object[][] logindata() {
		return new Object[][] { new Object[] { "kiran", "123456" }, new Object[] { "kiran", "password" },
				new Object[] { "123456", "123456789" }, new Object[] { "@#$%", "$%^&**" },
				new Object[] { "@#$%^", "123456" }, new Object[] { "kiran@gmail.com", "!@#$%" },

		};
	}
}
