package seleniumPrograms.HandlingPopUps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CopyOfDatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\updatedchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ctl00_mainContent_txt_Fromdate').value='11-02-2019'");
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='11/02'");
		js.executeScript("document.getElementById('view_fulldate_id_1').value='Mon, Feb 11 2019'");
		
	}
}
