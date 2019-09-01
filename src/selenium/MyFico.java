package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFico {

	public static void main(String[] args) {
		
		System.out.println("I am starting");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumTest\\lib\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org");
		
		System.out.println("I am here");
		
		driver.quit();
		
	}

	
	
	
	
	
	
}
