package seleniumPrograms;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pagination {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("leninkumaryenni2");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("trynewpwd");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By
				.xpath("//div[@role='button'][@aria-label='Older']"));
		List<WebElement> rows = new ArrayList<WebElement>();
		while (true) {
			rows.addAll((List<WebElement>) driver.findElements(By
					.xpath("(//table)[4]/tbody/tr")));
			Thread.sleep(2000);
			try{
				System.out.println(button.getAttribute("aria-disabled"));
				if("true".equals(button.getAttribute("aria-disabled"))) {
					break;
				}
				else {
					button.click();
					Thread.sleep(2000);
				}
			}
			catch(Exception e) {
				System.out.println("In catch");
				//button.click();
				Thread.sleep(2000);
				continue;
			}
			System.out.println("rows::"+rows.size());
		}
		
		System.out.println(rows.size());
		driver.close();
	}
}
