package interviewQuestions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumPrograms.HandlingPopUps.UsingJavaScriptExecutor;

public class WaitCommands extends UsingJavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver,20);
		/*WebElement element= driver.findElement(By.xpath(".//*[@name='q']"));*/
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@name='q']")));
		drawBorder(element,driver);
		System.out.println("Clicked after immediate found");
		/*driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);*/
		element.sendKeys("selenium");
		WebElement button=driver.findElement(By.name("btnK"));
		drawBorder(button,driver);
		button.click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		driver.navigate().to("https://wiki.saucelabs.com/display/DOCS/Best+Practice%3A+Use+Explicit+Waits");

		String actualTitle="Best Practice: Use Explicit Waits - The Sauce Labs Cookbook - Sauce Labs Documentation Wiki";
		String expectedtitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}

}
