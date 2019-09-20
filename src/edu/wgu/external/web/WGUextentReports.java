package edu.wgu.external.web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WGUextentReports {
	 private static WebDriver driver = null;

	public static void main(String[] args){
		//creates extent reports and attach reporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//creates a toggle for the given test, adds all log events under it
		ExtentTest Test1 = extent.createTest("GoogleSearchtest");

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Test1.log(Status.INFO,"starting test case");
		driver.get("https://www.google.com/");
		Test1.pass("navigates to google.com");
		Test1.pass("Entered inn seacrh box");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		
		textbox.sendKeys("https://www.wgu.edu/"); 
		Test1.pass("entered final url");
		driver.close();
		driver.quit();
		Test1.info("test completed");

	}


}
