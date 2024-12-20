package com.tka.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tka.utilities.SeleniumUtilities;
import com.tka.utilitiesprop.PropUtil;

public class UsefulLink {
	
	@Test
	public void testUsefulLinkTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[1]/h1");
		String expresult = "Useful Links";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
	}
	@Test
	public void testSubTitle() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[1]");
		String expresult = "* Internet Required";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
	}
	@Test
	public void testScheduleGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testScheduletext() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]");
		String expresult = "Schedule";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void testVideoLacturesAllTopicsGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testVideoLacturesAllTopicsText() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]");
		String expresult = "VideoLacturesAllTopics";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void testSeleniumInterviewQueGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testSeleniumInterviewQueText() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[2]");
		String expresult = "SeleniumInterviewQuestion";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void testJavaInterviewQueGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testJavaInterviewQueText() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[2]");
		String expresult = "JavaInterviewQuestion";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void testCoursesGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testCoursesText() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[2]");
		String expresult = "Courses";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void testPlacementGoClick() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.clickButton(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[7]/td[3]/a");
		SeleniumUtilities.quitButton(driver);
		Assert.assertTrue(true);
		}
	@Test
	public void testPlacementText() {
		WebDriver driver = SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver, PropUtil.valueOfAnyKey("UsefulLink"));
		String actresult = SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[7]/td[2]");
		String expresult = "Placement";
		SeleniumUtilities.quitButton(driver);
		Assert.assertEquals(actresult, expresult);
		}
	@Test
	public void table() {
		WebDriver driver=SeleniumUtilities.openBrowser();
		SeleniumUtilities.OpenANyUrl(driver,PropUtil.valueOfAnyKey("UsefulLink"));
		SeleniumUtilities.getAnyText(driver,"/html/body/div/div[1]/section[2]/div/div");
		
		
		
	}
}
