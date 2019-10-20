package edu.wgu.external.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WguDegreePage {

	@BeforeTest
	public static void SetBrowserConfig(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	@Test
	public static void LaunchWGU(WebDriver driver) {
		driver.get("https://www.wgu.edu/");
	}
	@AfterTest
	public static void TearDown(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
}
