package testNGtutorial;

import org.testng.annotations.BeforeSuite;

public class TestOrder {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite() from TestOrder");
	}
	/*@Test(groups={"orderBo", "save"})
	public void testMakeOrder() {
	  System.out.println("testMakeOrder");
	}

	@Test(groups={"orderBo", "save"})
	public void testMakeEmptyOrder() {
	  System.out.println("testMakeEmptyOrder");
	}

	@Test(groups="orderBo")
	public void testUpdateOrder() {
		System.out.println("testUpdateOrder");
	}

	@Test(groups="orderBo")
	public void testFindOrder() {
		System.out.println("testFindOrder");
	}*/


}
