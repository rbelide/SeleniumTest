package thoughtlab.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import listenrs.RetryAnalzer;

public class RequestaQuote {

	static WebDriver driver;
	
	@BeforeTest
	public static void Url()  {
		
		RequestaQuoteComponents.SetUpChrome();
	}
	@Test(retryAnalyzer = RetryAnalzer.class)
	public static void Website() {
	RequestaQuoteComponents.RequestQuote(driver);
	}
	@AfterTest
	public static void close() {
	RequestaQuoteComponents.TearDown(driver);
	}
}
