package seleniumPrograms.Notes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserScript {
	WebDriver driver;
	/**
	 * This function will execute before each Test tag in testng.xml
	 * 
	 * @param browser
	 * @throws Exception
	 */
	@Test
	@Parameters("site")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("facebook")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Drivers\\updatedchrome\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		
		else if (browser.equalsIgnoreCase("twitter")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"D:\\Drivers\\updatedchrome\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
			driver.get("https://twitter.com/");
		}
		else if (browser.equalsIgnoreCase("instagram")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"D:\\Drivers\\updatedchrome\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
