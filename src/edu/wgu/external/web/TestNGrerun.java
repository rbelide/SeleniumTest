package edu.wgu.external.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import listenrs.RetryAnalzer;

public class TestNGrerun {

	public static String Browser;
	public static WebDriver driver = null;


	@BeforeTest
	public static void  setBrowser() {
		CallNursingDegree.setBrowser();
	}
	@Test(priority = 1)
	public static void testRun() {
		CallNursingDegree.testRun();
	}
	@Test(retryAnalyzer = RetryAnalzer.class)
	public static void testRun1() {
		CallNursingDegree.testRun1();
	}
	@AfterTest//(dependsOnMethods = {"testRun1"})
	public static void TearDonw() {
		driver.quit();
		driver.close();
	}
}
