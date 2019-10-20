package edu.wgu.external.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CallNursingDegree {
	
	public static String Browser;
	public static WebDriver driver = null;

	@BeforeTest
	public static void  setBrowser() {
	   Browser = "chrome";
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public static void testRun() {
		driver.get("https://www.wgu.edu/");
		WebElement Degree = driver.findElement(By.xpath("//a[text()='Degrees']"));
	    Degree.click();
//	    WebElement start = driver.findElement(By.xpath("//div[@text()='Start']"));
//	    start.click();
}
	@Test
	public static void testRun1() {
		WebElement tution = driver.findElement(By.xpath("//a[text()='Tuition & Financial Aid']"));
		tution.click();
	}
	@AfterTest
	public static void TearDonw() {
		driver.quit();
		driver.close();
	}
}	