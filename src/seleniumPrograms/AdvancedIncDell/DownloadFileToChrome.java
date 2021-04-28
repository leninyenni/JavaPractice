package seleniumPrograms.AdvancedIncDell;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DownloadFileToChrome {
	WebDriver driver;
	File folder;
	@BeforeMethod
	public void setUp() {
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir(); // it checks if folder existing or not
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver.exe");
		// Setting new download directory path
		ChromeOptions options = new ChromeOptions();
		// Setting new download directory path
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
	}
	@Test
	public void downloadFileTest() {
		// URL loading
		driver.get("https://www.seleniumhq.org/download/");
		// Click on download selenium server jar file
		driver.findElement(By.xpath("//p[text()='Latest stable version ']/a"))
				.click();
	}
}
