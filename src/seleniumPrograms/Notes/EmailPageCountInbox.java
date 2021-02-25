package seleniumPrograms.Notes;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmailPageCountInbox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("leninkumaryenni2@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("trynewpwd");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@aria-hidden='true']")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.linkText("Show more messages")).click();
		int enoam = 0;
		while (2 > 1) {
			List<WebElement> nomp = driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
			int count = nomp.size();
			enoam = enoam + count;
			try {
				if (driver.findElement(By.xpath("//*[@aria-label='Older']"))
						.getAttribute("aria-disabled").equals("true"));
				{
					break;
				}
			} catch (Exception ex) {
				try {
					driver.findElement(By.xpath(("//*[@aria-label='Older']")))
							.click();
				} catch (Exception e) {
					driver.findElement(
							By.xpath(("(//*[@aria-label='Older'])[2]")))
							.click();
				}
				Thread.sleep(5000);
			}
		}
		System.out.println("Total number of email in ur inbox-" + enoam);
	}
}
