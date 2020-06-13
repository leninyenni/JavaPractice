package testNGtutorial;

import org.testng.annotations.BeforeSuite;

public class TestOrderSample {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite() from TestOrderSample");
	}
}
