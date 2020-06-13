package seleniumPrograms;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandling {

	public static void main(String[] argsStrings) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String str = driver.getWindowHandle(); // gives window id of parent
												// window
		// System.out.println(str);

		driver.findElement(
				By.xpath(".//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img"))
				.click();

		Set windows = driver.getWindowHandles(); // gives set of window ids in
													// alpha numeric format

		int a = windows.size();
		
		
		System.out.println(a);
		
	
		
		



	}
}
