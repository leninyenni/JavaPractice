package seleniumPrograms.Notes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WAFTry extends BaseClass {
	
	public static WebDriver driverz;
	
	@BeforeTest
	public void start()
	{
		driverz=testbase();	
	}
	
	@Test
	public void launch()
	{
		driverz.get("https://www.google.com");
	}
	
}
