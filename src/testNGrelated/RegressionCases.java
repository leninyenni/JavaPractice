package testNGrelated;

import org.testng.annotations.Test;

public class RegressionCases {

	@Test(groups={"regression"})
	public void tc_3() {
		System.out.println("regression case 1");
	}

	@Test(groups={"regression"})
	public void tc_4() {
		System.out.println("regression case 2");
		
		
	}
	@Test(groups={"smoke"})
	public void tc_5() {
		System.out.println("smoke case 3");
		}
}
