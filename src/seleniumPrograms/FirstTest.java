package seleniumPrograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://mail.google.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("leninkumaryenni");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("*****");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("passwordNext")).click();
		driver.close();
		
		
		
		

	}

}
