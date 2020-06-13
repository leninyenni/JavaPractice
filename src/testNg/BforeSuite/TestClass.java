package testNg.BforeSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {
	private String param;

	public TestClass(String param) {
		this.param = param;
		System.out.println("Cons" + param);
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@Test
	public void dummyTest() {
		System.out.println("dummy test " + param);
	}

}
