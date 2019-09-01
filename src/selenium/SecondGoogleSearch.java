package selenium;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com");
	}

}
