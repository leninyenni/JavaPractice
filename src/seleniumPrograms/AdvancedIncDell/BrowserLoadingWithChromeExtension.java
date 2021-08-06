package seleniumPrograms.AdvancedIncDell;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserLoadingWithChromeExtension {
	WebDriver driver;
	public static void main(String args[]) {
		 
		// Create object of ChromeOptions to load chrome driver options.
		ChromeOptions options = new ChromeOptions();
		// Load extension file from D: drive.
		options.addExtensions(new File("D://2.0.9_0.crx"));
		// Set chromedriver.exe path.
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		// Set browser capability to load options with driver.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// Load chrome driver with extension.
		ChromeDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
	}
}
