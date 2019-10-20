package edu.wgu.external.web;
import org.testng.annotations.Test;

public class TestNGdependencies {
	
	@Test(dependsOnMethods= {"paymentsPage"})
	public void mainPage() {
		System.out.println("WGU Main Page");
	}
	@Test(dependsOnMethods = {"ThankYouPage"})
	public void paymentsPage() {
	System.out.println("Thank you payment");
	}
	@Test
	public void ThankYouPage() {
		System.out.println("Western Governs Univeristy");
	}
}
