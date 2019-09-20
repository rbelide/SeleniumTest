package edu.wgu.external.web;

public class TestRunner {
	
	public static void main(String[] args) {
		HomePageTest homePageTest = new HomePageTest();
		
		homePageTest.setUpBeforeTestClass();
		homePageTest.doWork();
		homePageTest.tearDownAfterTestClass();
	}

}
 