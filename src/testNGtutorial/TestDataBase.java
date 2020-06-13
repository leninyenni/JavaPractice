package testNGtutorial;

import org.testng.annotations.BeforeSuite;

public class TestDataBase {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite() from TestDataBase");
	}
	/*@Test(groups = "db")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "db")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	@Test(groups = "db-nosql")
	public void testConnectMongoDB() {
		System.out.println("testConnectMongoDB");
	}

	@Test(groups = { "db", "brokenTests" })
	public void testConnectMySQL() {
		System.out.println("testConnectMySQL");
	}*/

}
