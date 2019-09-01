package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main (String[] args){
 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.creditcards.chase.com/");
		driver.get("https://www.google.com");
		driver.get("https://www.seleniumhq.org");
	}
}
