package seleniumPrograms.HandlingPopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
public class FileUploadPopup_Demo {
	public static void main(String[] args) throws InterruptedException,
			AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\updatedchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("D:\\Desktop\\testing\\hello.xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]"))
				.click();
		Thread.sleep(2000);
		driver.close();
	}
}