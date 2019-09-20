package edu.wgu.external.web;
import org.openqa.selenium.WebDriver;

public class WesternGovernsUniversityTour {
	 static WebDriver driver = null;
	 
	public static void main(String []args) throws InterruptedException {
		WguComponents WguComponents = new WguComponents(); 
		WguLandingPage WguLandingPage = new WguLandingPage();
		
		WguLandingPage.setBrowser();
		WguLandingPage.setBrowserConfig();
		WguComponents.LaunchWGU(driver);
		WguComponents.RequestInfo(driver);
	//	WguLandingPage.testRun();
		
	}

}
