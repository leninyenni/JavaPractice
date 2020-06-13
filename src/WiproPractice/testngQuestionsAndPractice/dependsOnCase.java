package WiproPractice.testngQuestionsAndPractice;

import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

public class dependsOnCase {
	
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1(){
		int e = 1/0;
	}
	
	@Test (dependsOnMethods="test1")
	public void test2(){
		System.out.println("test2");
	}
}
