package edu.wgu.external.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class WguLandingPageTestNG {

	static String Browser;
	static WebDriver driver = null;
	static WebElement dropdownBusiness;

//	public static void main (String []args) throws InterruptedException {
//		 
//		setBrowserConfig();
//		testRun();	
//		Degree(driver);
//		Admission(driver);
//		FreeAppCode(driver);
//		Tution(driver);
//		//AboutLink(driver);
//		
	//}
     @BeforeTest
		public static WebDriver setBrowserConfig() {
		Browser="Chrome";
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		return driver = new ChromeDriver(); 
	}
	
     @Test (priority = 1)
	public static void testRun() throws InterruptedException 
	{
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("https://www.wgu.edu/"); 

		List<WebElement> url = driver.findElements(By.xpath("//a"));
		int count = url.size();
		System.out.println("This is the count of URLS present in page: " + count);
		driver.get("https://www.wgu.edu/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	}
     @Test(priority =2)
	public static WebElement Degree(WebDriver driver) {
		WebElement DegreeLink = driver.findElement(By.xpath("//a[text()='Degrees']"));
		DegreeLink.click();
		System.out.println("Degree" + DegreeLink);
		return DegreeLink;
		
	}
      @Test(priority =3)
	public static WebElement Admission(WebDriver driver) {
		WebElement AdmissionLink = driver.findElement(By.xpath("//a[text()='Admissions']")); 
		AdmissionLink.click();
		return AdmissionLink;
	}
      @Test(priority =4)
	public static WebElement Tution(WebDriver driver) throws InterruptedException {
		WebElement TutionLink = driver.findElement(By.xpath("//a[text()='Tuition & Financial Aid']"));
		TutionLink.click();
		Thread.sleep(8000);
		return TutionLink;
	}
      @Test(priority =5)
	public static WebElement AboutLink(WebDriver driver) 
	{
		WebElement AboutLink = driver.findElement(By.xpath("//a[@text()='About']"));
		AboutLink.click();
		return AboutLink;
	}
      @Test(priority =6)
	public static WebElement Subscriber(WebDriver driver) {
		WebElement Ssr = driver.findElement(By.xpath("//a[@class='button blue-solid']"));
		Ssr.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@id ='FirstName']"));
		FirstName.sendKeys("Ramu");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		LastName.sendKeys("Endtoend");
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		Email.sendKeys("noname@student.com");
		return Email;
	}
//	public static WebElement FreeAppCode(WebDriver driver) {
//		WebElement Po_First_name = driver.findElement(By.xpath("//input[@id='FirstName']"));
//		Po_First_name.sendKeys("Ramu");
//		return Po_First_name; 
	//}
	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Ramu test is completed");
	}
	
	}
