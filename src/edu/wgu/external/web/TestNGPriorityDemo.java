package edu.wgu.external.web;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority = 2 )
	public void test1() {
		System.out.println("Main Page");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("Payment Page");
	}
	
	@Test(priority = 0)
	public void test3() {
		System.out.println("Confirmation");
	}
}



