package testNg.BforeSuite;

import org.testng.annotations.Factory;


	
public class TestClassFactory {
	@Factory
	public Object[] createTestClass() {
		return new Object[]{new TestClass("3"), new TestClass("4")};
	}

}
