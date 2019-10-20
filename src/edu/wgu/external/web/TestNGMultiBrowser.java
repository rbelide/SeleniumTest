package edu.wgu.external.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGMultiBrowser {

	WebDriver driver = null;

	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName) {
		System.out.println("BrowserName is: " + browserName);

		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 

		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void Test() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(6);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("Test is complete");

	}

}

