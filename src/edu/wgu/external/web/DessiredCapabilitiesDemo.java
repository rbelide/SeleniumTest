package edu.wgu.external.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DessiredCapabilitiesDemo {

	static WebDriver driver = null;
 
	public static void main(String []args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("GetVersion", true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\driver\\chromedriver.exe");
		  driver  = new InternetExplorerDriver(caps);   
		  
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("https://www.wgu.edu/"); 
		driver.close();
		driver.quit();


	}

}
