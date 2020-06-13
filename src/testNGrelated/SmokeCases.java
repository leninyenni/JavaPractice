package testNGrelated;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeCases {
  @Test(groups={"smoke"})
  public void tc_1() {
	  System.out.println("this is smoke test case1");
	  Assert.assertEquals("test", "test");
  }
  
  @Test(groups={"smoke"},dependsOnMethods={"tc_1"})
  public void tc_2()
  {
	  System.out.println("this is smoke test case2");
  } 
  
	@Test(groups={"regression"})
	public void tc_45() {
		System.out.println("regression case 2 from smoke class");
		
		
	}
}
