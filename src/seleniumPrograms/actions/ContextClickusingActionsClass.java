package seleniumPrograms.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickusingActionsClass {
	
	//ContextClick does not work on firefox browser - pls do it on chromebrowser
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//enter the url
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	//right click (context click) on actitime link
	Actions actions = new Actions(driver);
	//right click on link
	actions.contextClick(link).build().perform();

	//press 'w' from the keyboard for opening in a new window
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);
	
	}
}

