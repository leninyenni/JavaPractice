package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigbossScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//91939//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		for (int i=1;i<51;i++)
		{
			driver.get("https://www.scooptimes.com/television/bigg-boss-telugu-vote/9654");
			WebElement rahul= driver.findElement(By.xpath("//input[@id='PDI_answer48117298']"));
			WebElement vote=driver.findElement(By.xpath("//a[contains(@class,'css-vote-button')]"));
			WebDriverWait wait = new WebDriverWait (driver, 20);
			wait.until(ExpectedConditions.visibilityOf(rahul)).click();
			wait.until(ExpectedConditions.visibilityOf(vote)).click();
			Thread.sleep(2000);
			
		}
		System.out.println("done");
	
		
		
		
	}
}
