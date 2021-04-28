package seleniumPrograms.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 2. enter the url -
		driver.navigate().to("https://demo.actitime.com/login.do");
		// Used �id� locator to find USERNAME text box
		WebElement unTB = driver.findElement(By.name("username"));
		//Clear the existing value present in the text box
		unTB.clear();
		// Enter value into the USERNAME text box
		unTB.sendKeys("admin");
		// Used �name� locator to find Password text box
		WebElement passTB = driver.findElement(By.name("pwd"));
		//Clear the existing value present in the text box
		passTB.clear();

		//Halt the program execution for 2 seconds
		Thread.sleep(2000);
		// Enter value into the Password text box
		passTB.sendKeys("manager");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		}
}
