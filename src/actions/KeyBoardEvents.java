package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	//Enter Selenium in google search text box
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	act.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);

}
}