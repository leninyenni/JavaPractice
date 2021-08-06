package seleniumPrograms.HandlingPopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingCalendarUsingJavascript {
	public static void setDateUsingJavaScriptInCalendar(WebDriver driver,
			String value, WebElement calLocator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "arguments[0].setAttribute('value','" + value + "');";
		js.executeScript(script, calLocator);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "E://Drivers//geckodriver.exe"); File pathToBinary = new
		 * File("C://Program Files//Mozilla Firefox//firefox.exe");
		 * FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		 * FirefoxProfile firefoxProfile = new FirefoxProfile(); WebDriver
		 * driver = new FirefoxDriver(ffBinary,firefoxProfile);
		 */
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		// driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		// Locating departure date calendar
		WebElement departCal = driver.findElement(By
				.name("ctl00$mainContent$txt_Fromdate"));
		setDateUsingJavaScriptInCalendar(driver, "25-02-2017", departCal);
		Thread.sleep(5000);
	}
}
