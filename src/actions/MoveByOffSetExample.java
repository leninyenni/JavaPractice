package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveByOffSetExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();

		WebElement fashionIcon=driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions a = new Actions(driver);
		int x1 = fashionIcon.getLocation().getX();
		System.out.println(x1);
		int y1 = fashionIcon.getLocation().getY();
		System.out.println(y1);
		a.moveByOffset(x1, y1).build().perform();
		a.release();

		Thread.sleep(3000);
		WebElement appliancesIcon=driver.findElement(By.xpath("//div[text()='Appliances']"));

		/*int x2 = appliancesIcon.getLocation().getX();
		System.out.println(x2);
		int y2 = appliancesIcon.getLocation().getY();
		System.out.println(y2);
		a.moveByOffset(x2, y2).build().perform();
		System.out.println("hi len");
*/
		//most preferable way.some issues with offset setting values
		 a.moveToElement(appliancesIcon).build().perform();
	}
}
