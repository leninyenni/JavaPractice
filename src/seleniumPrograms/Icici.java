package seleniumPrograms;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Icici {
	public static void main(String[] args) throws InterruptedException,
			AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// Use robot class to press Ctrl+t keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WebElement textsearch = driver.findElement(By.xpath("//div[@id='fakebox-text']"));
		System.out.println(textsearch.getText());
		System.out.println(textsearch.getAttribute("innerText"));
		System.out.println(textsearch.getAttribute("innerHTML"));
		
		driver.quit();
	
	}
}
