package seleniumPrograms.HandlingPopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checkboxradio")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		By by=By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[2]/preceding-sibling::*");
		WebElement web=driver.findElement(by);
		web.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[7]/preceding-sibling::*"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("(//*[contains(@class,'ui-checkboxradio-icon-space')])[9]/preceding-sibling::*"))
				.click();
		Thread.sleep(5000);
		driver.close();
	}
}