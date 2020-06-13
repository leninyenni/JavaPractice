package seleniumPrograms;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class YatraDatePick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yatra.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datePickerDepart_dom1').value='18/07/2013'");
	}
}
