package seleniumPrograms.Notes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertDemo {
	
	@Test
	public void testSoft()
	{
		SoftAssert assertion= new SoftAssert();
		System.out.println("soft assertion check");
		assertion.assertEquals(12, 13,"Please check the condition");
		System.out.println("it works");
		assertion.assertAll();
	}
	@Test
	public void testHard()
	{
		System.out.println("hard assertion check");
		Assert.assertEquals(12, 13,"Please check with dev");
		System.out.println("it works");
	}

}
