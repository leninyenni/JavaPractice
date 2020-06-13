package testNg.BforeSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChildTest1 {

	@BeforeSuite
	@Parameters("param")
	public void beforeSuite(String p) {
		System.out.println("ChildTestClass1: before suite"+p);
	}
	
	@Test
	@Parameters("param")
	public void test1(String p) {
		System.out.println("test1: test" + p);
	}
	
	
}
