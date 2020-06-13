package seleniumPrograms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class CreateSignUpFacebook {
	public static WebDriver driver;
	public static TakesScreenshot tss;
	public static WebElement wb;
	public static SearchContext sc;
	public static FirefoxDriver fd;
	public static RemoteWebDriver rwd;
	public static By by;
	
	
	
	@Test
	public static void createsignup() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		/*
		 * WebElement element = driver.findElement(By.name("q"));
		 * element.sendKeys("Cheese!");
		 */
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(
				"asdfsf");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(
				"saaddsf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(
				"9000000000");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(
				"S@tish91");
		WebElement element = driver.findElement(By
				.xpath("//select[@id='month']"));
		Select selMonth = new Select(element);
		selMonth.selectByVisibleText("May");
		Thread.sleep(3000);
		selMonth.selectByIndex(11);
		Thread.sleep(3000);
		selMonth.selectByValue("12");
		
		List<WebElement> months=selMonth.getOptions();
		for(WebElement month:months)
		{
			System.out.println(month.getText());
		}
		
		System.out.println("selected may");
		/*driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findsElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);*/
/*		boolean value = isAlertPresent();
		System.out.println(value);
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}*/
/*	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	} // isAlertPresent()
*/	/*
	 * private static WebDriver getFireDriver() {
	 * System.setProperty("webdriver.gecko.driver",
	 * "D:\\Drivers\\geckodriver.exe"); WebDriver webDriver = new
	 * FirefoxDriver();
	 * 
	 * return webDriver; }
	 */
}
}
