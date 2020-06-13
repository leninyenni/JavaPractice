package testNGrelated;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test()
	public void quitApplication(WebDriver driver) {
		driver=GmailLogIn.driver;
		driver.quit();
	}
}
