package edu.wgu.external.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WGUAdmissionPage {

	static String Browser;
	private static String admTab;
	static WebDriver driver = null;

	public static void main(String []args) {


		WguLandingPage.setBrowser();
		WguLandingPage.setBrowserConfig();
		LaunchadmissionsPage(driver);
	}
	

	public static void setBrowser() {
		Browser="Chrome";
	}

	public static void setBrowserConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumTest\\"
				+ "lib\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}

	public static void LaunchadmissionsPage(WebDriver driver) {
		driver.get("https://www.wgu.edu/admissions.html");
	}
	public static void AdmissionTab(WebDriver driver) {
		WebElement admTab = driver.findElement(By.xpath("//a[@class='Admissions']"));
		admTab.click();
	}

}
