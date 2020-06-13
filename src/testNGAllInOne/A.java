package testNGAllInOne;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	@Test
	void test1()
	{
		System.out.println("test1 from A class");
	}
	@Test
	void test2()
	{
		System.out.println("test2 from A class");
	}
	@BeforeMethod
	void test3()
	{
        long id = Thread.currentThread().getId();
        System.out.println("Before Method " + "test3()" + ". Thread id is: " + id);
		System.out.println("test3 from A class inside before method");
	}
	@BeforeMethod
	void test4()
	{
		long id = Thread.currentThread().getId();
        System.out.println("Before Method " + "test4()" + ". Thread id is: " + id);
		System.out.println("test4 from A class inside before method");
	}
}
