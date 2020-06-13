package interviewQuestions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Explicit wait
		//WebDriverWait wait= new WebDriverWait(driver,20);
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gs_htif0']")));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); 
		WebElement element=driver.findElement(By.xpath(".//*[@name='q']"));
		element.sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");

	}

}
