package thoughtlab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RequestaQuoteComponents {
	 

	@BeforeTest
	public static void SetUpChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\driver\\chromedriver.exe" );
	}
	@Test
	public static void RequestQuote(WebDriver driver) {
		driver = new ChromeDriver();
		driver.get("https://www.thoughtlab.com/");
		WebElement url = driver.findElement(By.xpath("//div[text()='Request A Quote']"));
		//url.sendKeys(Keys.CONTROL +"t");
		url.click();
		System.out.println("Click was successful"+ url) ;
	}
	@AfterTest
      public static void TearDown(WebDriver driver) {
    	  driver.quit();
    	  driver.close();
      }
}
