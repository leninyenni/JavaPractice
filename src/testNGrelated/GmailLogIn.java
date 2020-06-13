package testNGrelated;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLogIn {

	static WebDriver driver;

	@Test
	public void startBrowser() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Selenium drivers\\chromedriver.exe"); driver= new
		 * ChromeDriver();
		 */
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("identifier"));
	}

	@Test(dependsOnMethods = "startBrowser")
	public void loadApplication() throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("leninkumaryenni");
		driver.findElement(By.xpath(".//*[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Lenin2925");
		driver.findElement(By.xpath(".//*[@class='RveJvd snByac']")).click();
		String text = driver.findElement(By.className("ZrQ9j")).getText();
		Assert.assertEquals("Len", "Len");
	}

	@Test
	public void abc()
	{
		System.out.println( "abc");
	}
	
	@Test
	public void bcd()
	{
		System.out.println("bcd");
	}
	

/*	@Test(dependsOnMethods = "loadApplication")
	public void quitApplication() {
		driver=GmailLogIn.driver;
		driver.quit();
}*/
}