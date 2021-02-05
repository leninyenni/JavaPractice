package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Locations {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[starts-with(@class,'_2AkmmA')])[1]")).click();
		WebElement e = driver.findElement(By.xpath("//*[text()='Women']"));
		Actions a = new Actions(driver);
		int x = e.getLocation().getX();
		System.out.println(x);
		int y = e.getLocation().getY();
		System.out.println(y);
		a.moveByOffset(x, y).build().perform();
		// a.moveToElement(e).build().perform();
	}
}
