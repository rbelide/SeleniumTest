package edu.wgu.external.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WguComponents {

	private static WebElement textbox; 
	private static WebElement requestInfo;
	private static WebElement dropdown_business;

	public static WebElement SeacrhWGU(WebDriver driver) {
		driver.get("https://www.google.com/");
		textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("https://www.wgu.edu/"); 
		return textbox;
	}

	public static void LaunchWGU(WebDriver driver) {
		driver.get("https://www.wgu.edu/");
		driver.manage().window().maximize();
	}
	public static WebElement RequestInfo(WebDriver driver) {
		requestInfo = driver.findElement(By.xpath("//a[text()='Request Info']"));
		return requestInfo;
	}
	
	public static WebElement dropdown_business(WebDriver driver) {
    	WebElement dropdown_businsess = driver.findElement(By.xpath("//a[@text()='Business']"));
    	dropdown_business.click();
    	return dropdown_business; 
}

}