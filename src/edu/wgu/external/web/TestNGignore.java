package edu.wgu.external.web;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class TestNGignore {
	@Ignore
	@Test
	public void Hidden() {
		System.out.println("HiddenTools");
	}

}
