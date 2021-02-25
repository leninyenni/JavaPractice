package seleniumPrograms.Notes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserNavigationExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		String title=driver.getTitle();
		System.out.println("Title of the page is :" + title);

		/*String pagesource=driver.getPageSource();
		System.out.println("Page source is :");
		System.out.println(pagesource);
		*/

		String cururl=driver.getCurrentUrl();
		System.out.println(cururl);

		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");*/
	/*	String str=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");*/
		/*System.out.println(str);*/
		/*Thread.sleep(3000);

		driver.navigate().to("https://www.irctc.com");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();*/

		driver.close();
		driver.quit();
	}
}
