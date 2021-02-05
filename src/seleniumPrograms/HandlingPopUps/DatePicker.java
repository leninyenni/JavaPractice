package seleniumPrograms.HandlingPopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By
				.id("ctl00_mainContent_txt_Fromdate"));
		String dateValue = "11-02-2019";
		selectDateByJS(driver, element, dateValue);
		
		
	}
	public static void selectDateByJS(WebDriver driver, WebElement element,String dateVal) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateVal+ "');", element);
	driver.findElement(By.className("ui-datepicker-trigger")).click();
	}
}
