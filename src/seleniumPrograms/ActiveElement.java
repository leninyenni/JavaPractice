package seleniumPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActiveElement {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.way2sms.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("9545649454");
		Thread.sleep(5000);
		driver.close();
	}
}
