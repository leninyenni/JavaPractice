package seleniumPrograms.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DropdownMenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com/");
		Actions action = new Actions(driver);
		// movetoElement - used for mouse hover
		// Mouse hover on � AREAS OF EXPERTISE � menu
		WebElement AreaOfExpertise = driver.findElement(By
				.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
		// Click on � AREAS OF EXPERTISE � menu
			
		WebElement cloudApp = driver.findElement(By.linkText("CLOUD APPLICATIONS"));
		action.moveToElement(cloudApp).click().perform();

		Thread.sleep(3000);
		//composite multiple seleniumPrograms.actions can be achieved using the below statement
		/*action.moveToElement(AreaOfExpertise).click(cloudApp).build().perform();*/
	}
}
