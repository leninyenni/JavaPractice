package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com");
		  Thread.sleep(5000);
/*		Alert alert= driver.switchTo().alert();
		alert.dismiss();*/
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();

		List<WebElement> listofsections= driver.findElements(By.xpath("//div[@id='container']/div/div[2]/div/div/div"));

		  Actions a = new Actions(driver);
		  for (WebElement e:listofsections) {
		  	Thread.sleep(2000);
			  a.moveToElement(e).build().perform();

			  /*int x=e.getLocation().getX();
			  int y=e.getLocation().getY();
			  a.moveByOffset(x,y).build().perform();*/
		  }
	}
}

