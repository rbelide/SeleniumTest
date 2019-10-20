package edu.wgu.external.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlunetWaitDemo {

	public void Test(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN)
	}
	
}
