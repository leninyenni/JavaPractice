package seleniumPrograms.AdvancedIncDell;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeepFileDiscardChangeDownloadDirOfChrome {
	 public static void main(String[] args) throws IOException {
		 
		 System.setProperty("webdriver.chrome.driver",
					"D://Drivers//chromedriver_win32//chromedriver.exe");
			// Setting new download directory path
	 
	        // Setting new download directory path
	        Map<String, Object> prefs = new HashMap<String, Object>();
	         
	        prefs.put("profile.default_content_settings.popups", 0);
	         
	        // Use File.separator as it will work on any OS
	        prefs.put("download.default_directory",
	                System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");
	         
	         
	        // suppressing "This type of file can harm your computer." popup 
	        prefs.put("safebrowsing.enabled", "false"); 
	         
	         
	        prefs.put("download.prompt_for_download", "false");
	         
	        // Adding capabilities to ChromeOptions
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", prefs);
	         
	         
	        // Printing set download directory
	        System.out.println(options.getExperimentalOption("prefs"));
	         
	        // Launching browser with desired capabilities
	        ChromeDriver driver= new ChromeDriver(options);
	         
	        // URL loading
	        driver.get("https://www.seleniumhq.org/download/");
	         
	        // Click on download selenium server jar file
	        driver.findElement(By.xpath("//p[text()='Latest stable version ']/a")).click();
	         
	 
	    }
}
