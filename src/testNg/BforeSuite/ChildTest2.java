package testNg.BforeSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChildTest2 {
	
	@BeforeSuite
	@Parameters("param")
	public void beforeSuite(String p) {
		System.out.println("ChildTestClass2: before suite " + p);
	}
	@Test
	@Parameters("param")
	public void test2(String p) {
		System.out.println("test2: test" + p);
	}

}
