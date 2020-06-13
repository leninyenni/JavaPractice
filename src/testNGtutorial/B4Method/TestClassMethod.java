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

public class TestClassMethod {
	@BeforeSuite
	public void doBeforeSuite() {
		System.out.println("TestClassMethod: before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("TestClassMethod: before test");
	}

	@Test
	public void unitLevel1() {
		System.out.println("TestClassMethod: Unit level1 testing");
	}

	@Test
	public void unitLevel2() {
		System.out.println("TestClassMethod: Unit level2 testing");
	}

	@BeforeMethod
	public void beforeMethod_aa() {
		System.out.println("TestClassMethod: before method aa");
	}

	@BeforeMethod
	public static void beforeMethod_ab() {
		System.out.println("TestClassMethod: static before method ab");
	}

	@Parameters({ "param" })
	@BeforeMethod
	public void beforeMethodWithParam() {
		System.out.println("TestClassMethod: before method with param ");
	}

	@AfterMethod
	public void afterMethod_aa() {
		System.out.println("TestClassMethod: after method");
	}

	@AfterMethod
	public void afterMethod_ab() {
		System.out.println("TestClassMethod: after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("TestClassMethod: before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TestClassMethod: after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("TestClassMethod: after test");
	}
}
