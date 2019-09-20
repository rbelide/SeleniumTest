package edu.wgu.external.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageTest extends Test {

	@Override
	protected void doWork() {
		WebElement containerElement = driver.findElement(By.id("container"));	
		System.out.println("Container Element: " + containerElement);
	}

}
