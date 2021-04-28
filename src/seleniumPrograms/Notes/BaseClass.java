package seleniumPrograms.Notes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver testbase()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void waitForElement(WebDriver driver, WebElement element)
	{
		wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}





}


