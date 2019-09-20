package edu.wgu.external.web;

import org.openqa.selenium.WebDriver;

public class LaunchPages {
	         

	public static void main(String[] args) throws InterruptedException {
		
		WguLandingPage.setBrowser();
		WebDriver driver = WguLandingPage.setBrowserConfig();
		WguLandingPage.testRun();	
		WguLandingPage.Degree(driver);
//		WguLandingPage.Admission(driver);	
//		WguLandingPage.Tution(driver);
//		WguLandingPage.AboutLink(driver);
		System.out.println("Launched all pages" );
	}

}
