package edu.wgu.external.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class Test {

	protected WebDriver driver = null;
	
	protected void setUpBeforeTestClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Documents\\Ramu\\lib\\Drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.wgu.edu/");
	}

	 protected abstract  void doWork();
	 

	  protected void tearDownAfterTestClass() {
		  driver.close();
		  driver.quit();
	  }	
}
