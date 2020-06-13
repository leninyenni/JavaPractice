package seleniumPrograms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("leninkumaryenni");
		driver.findElement(By.id("pass")).sendKeys("Lenin2925");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		
		
		
	}
}
