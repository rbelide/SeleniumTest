package edu.wgu.external.web;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test(groups = {"AllClassTests"})
public class TestNGGroupsDemo {
	
    @Test(groups = {"Sanity"}) 
	public void test1() {
		System.out.println("This is test 1");
	}
    
    @Test(groups = {"Smoke"}) 
	public void test2() {
		System.out.println("This is test 2");
	}
    
    @Test(groups = {"windows.Regression"})
	public void test3() {
		System.out.println("This is test 3");
	}
    
    @Test(groups = {"Linux.Regression"}) 
	public void test4() {
		System.out.println("This is test 4");
	}
    
}

