package testNGtutorial.B4Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassMethod2 {
	@BeforeSuite
	public void doBeforeSuite() {
		System.out.println("testClass2: before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("testClass2: before test");
	}
	
	@Parameters({ "param" })
	@BeforeMethod
	public void beforeMethodWithParam() {
		System.out.println("testClass2: before method with param ");
	}	
	@Test
	public void unitLevel1() {
		System.out.println("testClass2: Unit level1 testing");
	}
	
	@Test
	public void unitLevel2() {
		System.out.println("testClass2: Unit level2 testing");
	}
	
	@Parameters({ "param" })
	@AfterMethod
	public void aftermethod(String p) {
		System.out.println("testClass2: after method with param " + p);
	}	
	
	@BeforeClass
	public void doBeforeClass() {
		System.out.println("testClass2: before class");
	}
	@AfterClass
	public void doAfterClass() {
		System.out.println("testClass2: after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("testClass2: after test");
	}
}
